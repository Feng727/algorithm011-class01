class Solution {
    //贪心算法
    public boolean canJump(int[] nums) {
        int len = nums.length, farestIndex = 0;
		for(int i=0; i<len; i++) {
			if(i<=farestIndex)
				farestIndex = Math.max(farestIndex, i+nums[i]);
			    if(farestIndex>=len-1)
			    	return true;
		}
		return false;
    }
}