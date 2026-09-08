class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            queue.offer(new int[]{key, value});
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] result = new int[k];
        for (int i=0; i<k; i++) {
            result[i] = queue.poll()[0];
        }
        return result;

    }
}
