class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //{{1, 2}, {2, 0}, ...}
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) +1);
        }
        List<Integer>[] buckets = new List[nums.length +1];
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<>();
            }
            buckets[value].add(key);
        }
        //[[1, 2], [3], ...]
        int[] result = new int[k];
        int current = 0; // to comupte if it's enough
        for (int i=buckets.length-1; i>=1; i--) {

            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                result[current] = num;
                current++;
                if (current == k) {
                    return result;
                }
            }
            }
        }
        return result;
        
    }
}
