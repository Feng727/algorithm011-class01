class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;//[left, right]
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(target == nums[mid]) return mid;
            if(nums[left] <= nums[mid]) { //前半部分有序
                if(nums[left] <= target && target < nums[mid]) { //目标在有序部分
                    right = mid - 1;
                }else {//目标在无序部分
                    left = mid + 1;
                }
            }else { //后半部分有序
                if(nums[mid] < target && target <= nums[right]) { //目标在有序部分
                    left = mid + 1;
                }else {//目标在无序部分
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}