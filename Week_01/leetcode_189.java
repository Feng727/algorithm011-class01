class Solution {
    // 官方暴力法
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int id=0; id<k; id++) {
            int prev = nums[len-1];
            for (int i=0; i<len; i++) {
                int temp = nums[i];
                nums[i] = prev;
                prev = temp;
            }
        }
    }
}