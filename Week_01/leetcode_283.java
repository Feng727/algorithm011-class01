class Solution {
    //快慢双指针法
    public void moveZeroes(int[] nums) {
         // 思路：直接将非0<——>0交换，1次遍历
        int index_nozero = 0; //记录非0元素的索引
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[index_nozero++] = temp;
            }
        }
    }
}