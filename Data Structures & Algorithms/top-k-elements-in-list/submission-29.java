class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) +1);
        }
        List<Integer>[] buckets = new ArrayList[n+1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<>();
            }
            buckets[value].add(key);
        }

        int[] result = new int[k];
        int currentSize = 0;
        for (int i=buckets.length-1; i>=1; i--) {
            if (buckets[i] != null) {
                for (int element : buckets[i]) {
                    result[currentSize] = element;
                    currentSize++;
                    if (currentSize == k) {
                        return result;
                    }
                
            }
            }
            
        }

        return result;
    }
}
