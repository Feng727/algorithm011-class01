import java.util.*;
public class Solution {
	List<List<Integer>> permuteUnique(int[] nums) {
		int len = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		if(len == 0)  //特殊情况判断，如果为空数组，则返回空列表
			return res;
        Arrays.sort(nums); // 排序方便剪枝
		Deque<Integer> path = new ArrayDeque<>(); //path:栈
		boolean[] used = new boolean[len]; //布尔数组初始化全部为false，用以判断某个元素已经被使用
		dfs(nums, path, 0, len, used, res);
		return res;
	}

    private void dfs(int[] nums, Deque<Integer> path, int depth, int len, boolean[] used, List<List<Integer>> res) {
			if(depth == len) { //层深==数组长度，表示已经达到最大深度
				res.add(new ArrayList<>(path));
				return;
			}
			for(int i=0; i<len; i++) {
				if(used[i]) // 如果该元素已经被使用过，则跳过
					continue;
                
                if(i>0 && nums[i] == nums[i-1] && used[i-1]== false)  //剪枝条件
                    continue;

				path.addLast(nums[i]);
				used[i] = true;
				dfs(nums, path, depth+1, len, used, res);
				path.removeLast();
				used[i] = false;
			}
	}

}