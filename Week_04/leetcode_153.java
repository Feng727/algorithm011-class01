class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;//[l,r]
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[left] <= nums[right]) {
                return nums[left];
            }
            
            if(nums[left]<=nums[mid]){ //前半部分有序
                left = mid + 1;
            }else {//前半部分无序序
                right = mid;
            }
        }
        return -1;
    }
}