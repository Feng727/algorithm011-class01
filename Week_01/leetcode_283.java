class Solution {
    //快慢双指针法
    public void moveZeroes(int[] nums) {
        // 思路：先将所有非零元素移动到前面，记录0的个数，最后在后边补0
        int count = 0;
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }else{
                count++;
            }
        }
        for (int i=index; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}