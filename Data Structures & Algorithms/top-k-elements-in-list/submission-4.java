class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) +1);
        }
        List<Integer> countList = new ArrayList<>(countMap.keySet());
        countList.sort((a, b) -> Integer.compare(countMap.get(b), countMap.get(a)));
        int [] result = new int[k];

        for (int i=0; i<k; i++) {
            result[i] = countList.get(i);
        }
        return result;
    }
}
