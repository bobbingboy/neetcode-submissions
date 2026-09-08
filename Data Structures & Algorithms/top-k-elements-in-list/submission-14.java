class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) +1);
        }
        List<Integer>[] bucket = new List[nums.length +1];
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }
        //[[1, 2], [3, 4, 5], [6, 7], ...]
        // 0, 1, 2, ..., nums.length
        int[] result = new int[k];
        int currentCount = 0;
        for (int i=bucket.length-1; i>=1; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[currentCount] = num;
                    currentCount++;
                    if (currentCount == k) {
                        return result;
                    }
                }
            }
        }
        return result;
        
    }
}
