class Solution {
    //快慢双指针法
    public void moveZeroes(int[] nums) {
        int slow_index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[slow_index];
                nums[slow_index++] = temp;
            }
        }
    }
}