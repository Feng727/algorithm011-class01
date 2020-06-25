class Solution {
    // System.arraycopy()方法，类似于官方的暴力法
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        //int[] temp = new int[len-1];
        for (int i=0; i<k; i++) {
            int cur = nums[len-1];
            System.arraycopy(nums, 0, nums, 1, len-1);
            nums[0] = cur;
        }
    }
}