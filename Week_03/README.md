学习笔记
**泛型递归和树的递归**

递归模板：
public void recur(int level, int param) { 
 // terminator 
 if (level > MAX_LEVEL) { 
 // process result 
 return; 
 } 
 // process current logic 
 process(level, param); 
 // drill down 
 recur( level: level + 1, newParam); 
 // restore current status 
 
}

递归要点：
1.不要人肉递归
2.找到**最近最简方法**，将其拆解成可重复解决的问题
3.**数学归纳法思维**

**分治、回溯**
分治模板：
def divide_conquer(problem, param1, param2, ...): 
# recursion terminator 
if problem is None: 
 print_result 
 return 
# prepare data 
 data = prepare_data(problem) 
 subproblems = split_problem(problem, data) 
# conquer subproblems 
 subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
 subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
 subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
...
# process and generate the final result 
 result = process_result(subresult1, subresult2, subresult3, …) 
 
 # revert the current level states

回溯：
找到一个可能存在的正确的答案；
在尝试了所有可能的分步方法后宣告该问题没有答案。
在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算