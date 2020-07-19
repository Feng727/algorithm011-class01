学习笔记
BFS:
通常用于寻找最短路径
代码模板：
public List<List<Integer>> bfs(node start, node target){
    List<List<Integer>> allResult = new ArrayList<>(); //输出最后结果时用
    Queue<node> q = new LinkedList<>();
    Set<node> visited = new HashSet<>(); //访问非树型数据结构时候用到
    //终止条件
    if(node == null)
        return allResult;
    //初始化
    int step = 0;
    q.offer(start);
    visited.add(start);
    //循环遍历
    while(!q.isEmpty()){
        int sz = q.size();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<sz; i++) {
            node curNode = q.poll();
            result.add(curNode.val);
            for (node x : curNode.children) {
                if(x is not visited){
                    q.offer(x);
                    visited.add(x);
                }
            }
        }
        step++;
        allResults.add(results);
    }
}



二分查找：
前提：01.目标函数必须单调
      02.存在上下界
      03.能够通过索引访问
代码模板：
01.查找一个数：
public int binarySearch(int[] nums, int target){
    int left = 0, right = nums.length-1;
    while(left <= right) {
        int mid = left + (right-left)/2;
        if(nums[mid] = target){
            return mid;
        }else if(target > nums[mid]){
            left = mid + 1;
        }else if(target < nums[mid]) {
            right = mid - 1;
        }
    }
    return -1; // 没有查询到
}

02. 查找左侧边界：
public int binarySearchLeftBound(int[] nums, int target){
    int left = 0, right = nums.length;  //区间为左开右闭[left, right)
    while(left < right) {  //结束条件是left == right,此时区间已经为空了
       int mid = left + (right - left)/2;
       if(nums[mid] == target) {
           right = mid;
       }else if(target > nums[mid]) {
           left = mid+1;
       }else if(target < nums[mid]) {
           right = mid;
       }
    }
    //若没有找到返回-1的处理
    if(left == nums.length) //搜到最右侧还没找到
       return -1;
    return (nums[left] == target)? left : -1;
}

03. 查找右侧边界：
public int binarySearchRightBound(int[] nums, int target){
    int left = 0, right = nums.length;  //区间为左开右闭[left, right)
    while(left < right) {  //结束条件是left == right,此时区间已经为空了
       int mid = left + (right - left)/2;
       if(nums[mid] == target) {
           left = mid + 1;
       }else if(target > nums[mid]) {
           left = mid+1;
       }else if(target < nums[mid]) {
           right = mid;
       }
    }
    //若没有找到返回-1的处理
    if(left == 0) //搜到最右侧还没找到
       return -1;
    return (nums[left-1] == target)? left-1 : -1; //特别注意这里是返回**left-1**或**right-1**
}

二分查找的注意点：01.注意左右边界，通常搜索一个数用[],搜索左右边界用[)
                02.搜索右边界时候注意返回的是**left-1**或**right-1**
                