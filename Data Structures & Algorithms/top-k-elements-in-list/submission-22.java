class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num)+1);
        }
        //now we could generate an array with each number exists
        List<Integer> numsList = new ArrayList<>(map.keySet());
        numsList.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));
        int[] result = new int[k];
        for (int i=0; i<k; i++) {
            result[i] = numsList.get(i);
        }
        return result;

    }
}
