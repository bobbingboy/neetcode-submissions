class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productsByAll = 1;
        List<Integer> zeroIndex = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                zeroIndex.add(i);
            } else {
                productsByAll = productsByAll * num;
            }
        }
        int[] result = new int[nums.length];
        Arrays.fill(result, 0);
        if (zeroIndex.size() > 1) {
            return result;
        }
        if (zeroIndex.size() == 1) {
            result[zeroIndex.get(0)] = productsByAll;
            return result;
        }
        for (int i=0; i<nums.length; i++) {
            int currentNum = nums[i];
            result[i] = productsByAll / currentNum;
        }
        return result;
    }
}  
