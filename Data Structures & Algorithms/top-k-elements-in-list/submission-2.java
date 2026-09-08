class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyByNumberMap = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if (!frequencyByNumberMap.containsKey(currentNumber)) {
                frequencyByNumberMap.put(currentNumber, 0);
            }
            frequencyByNumberMap.put(currentNumber, frequencyByNumberMap.get(currentNumber) +1);
        }
        List<Integer> uniqueNums = new ArrayList<>(frequencyByNumberMap.keySet());
        uniqueNums.sort((a, b) -> Integer.compare(frequencyByNumberMap.get(b), frequencyByNumberMap.get(a)));
        int[] result = new int[k];
        for (int j=0; j<k; j++) {
            result[j] = uniqueNums.get(j);
        }
        return result;

    }
}
