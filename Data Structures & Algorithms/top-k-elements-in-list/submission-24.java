class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //{{1, 3}, {2, 1}, ...} create a map with key is which number and value is count to the number appear
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            } 
            map.put(num, map.get(num) +1);
        }
        //create a min-heap with each element would be an array with siez be 2 to  describe a number and the count it appear
        //[num, count]
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            int[] array = new int[]{key, value};
            queue.offer(array);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] result = new int[k];
        int currentCount = 0;
        for (int i=0; i<k; i++) {
            result[i] = queue.poll()[0];
            currentCount++;
            if (currentCount == k) {
                return result;
            }
        }
        return result;
    }
}
