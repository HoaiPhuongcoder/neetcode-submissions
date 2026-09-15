class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;
        int[] res = new int[length];
       for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }
       return res;
    }
}