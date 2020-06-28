学习笔记

**第1节**：
第一部分：如何高效学习

精通一个领域3步曲：
. chunk it up
. deliberate practicing
. feedback

视频使用方法：
3分看视频，7分练习

leetcode刷题方法：

自顶向下、先写主要逻辑，再补充具体函数的编程方法。

切题4步法：
. 仔细读题，弄清题意
. 列出自己能想出的所有方法（在自己有思路的前提下，没思路直接看别人题解）
. 写代码
. 测试代码，leetcode上提交

5遍刷题法：
. 1遍：5 min 读题+思考，自己有思路按切题4步法走，没思路直接看“精选、官方、国际站中排名前3等优秀题解”——>背诵+默写；
. 2遍：立刻再次独立默写代码，并测试提交；
. 3遍：过24小时后再次独立code，并着重练习自己薄弱部分；
. 4遍：1周后再次独立code，并着重练习自己薄弱部分；
. 5遍：面试前1-2周，再刷一遍题

第二部分：数据结构与算法总览
数据结构：
一维：
• 基础：数组 array (string), 链表 linked list
• 高级：栈 stack, 队列 queue, 双端队列 deque, 集合 set, 映射 map (hash or map), etc
二维：
• 基础：树 tree, 图 graph
• 高级：二叉搜索树 binary search tree (red-black tree, AVL), 堆 heap, 并查集 disjoint set, 字典树 Trie, etc
特殊：
• 位运算 Bitwise, 布隆过滤器 BloomFilter
• LRU Cache

算法：
• If-else, switch —> branch
• for, while loop —> Iteration
• 递归 Recursion (Divide & Conquer, Backtrace)
• 搜索 Search: 深度优先搜索 Depth first search, 广度优先搜索 Breadth first search, A*, etc
• 动态规划 Dynamic Programming
• 二分查找 Binary Search
• 贪心 Greedy
• 数学 Math , 几何 Geometry


**第2节**：
时间复杂度：
方法:函数根据n值不同，总共运行多少次

O(1): Constant Complexity 常数复杂度
O(log n): Logarithmic Complexity 对数复杂度
O(n): Linear Complexity 线性时间复杂度
O(n^2): N square Complexity 平方
O(n^3): N cubic Complexity 立方
O(2^n): Exponential Growth 指数
O(n!): Factorial 阶乘
• 不考虑系数，只看最高复杂度
例子：
O(1) int n = 1000;
     System.out.println("Hey - your input is: " + n);
O(1) int n = 1000;
     System.out.println("Hey - your input is: " + n);
     System.out.println("Hmm.. I'm doing more stuff with: " + n);
     System.out.println("And more: " + n);
O(N) for (int i = 1; i <= n; i++) {
     System.out.println("Hey - I'm busy looking at: " + i);
     }
O(N^2) for (int i = 1; i <= n; i++) {
          for (int j = 1; j <=n; j++) {
              System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
          } 
       }
O(log(n)) for (int i = 1; i < n; i = i * 2) {
               System.out.println("Hey - I'm busy looking at: " + i);
          }
O(k^n) int fib(int n) {
            if (n < 2) return n;
                return fib(n - 1) + fib(n - 2);
            }
       }

主定理：
二分查找(Binary search):O(log(n))
二叉树遍历(Binary tree traversal):O(N)
有序二维矩阵(optimal sorted matrix search)：O(N)
归并排序(merge sort): O(nlog(n))

空间复杂度：
• 数组长度
• 递归深度

**第3节**：
数组：
操作     时间复杂度
prepend      O(1)
append       O(1)
lookup       O(1)

insert       O(n)
delete       O(n)

链表：

  操作     时间复杂度
prepend      O(1)
append       O(1)
insert       O(1)
delete       O(1)

lookup       O(n)
应用：LRU Cache  https://www.jianshu.com/p/b1ab4a170c3c

跳表：
注意：只能用于**元素有序**的情况。
跳表（skip list）对标的是平衡树（AVL Tree）和二分查找，是一种 插入/删除/搜索 都是 O(log n) 的数据结构。1989 年出现。
时间：lookup       O(log(n))
空间：             O(n)
应用：Redis


**第4节**：
stack:
Stack<Integer> stack = new Stack<>();

1. boolean res = stack.empty();    //true if and only if this stack contains no items; false otherwise

2. stack.push(item); // the item to be pushed onto this stack.

3. int res = stack.pop(); //Removes the object at the top of this stack and returns that object as the value of this function.
                         **Throws**:  EmptyStackException - if this stack is empty.
4. int res = stack.peek();// Looks at the object at the top of this stack without removing it from the stack. 
                          **Throws**: EmptyStackException - if this stack is empty.    
5. int index = stack.search(item)  //the 1-based position from the top of the stack where the object is located;
                                   //the return value -1 indicates that the object is not on the stack.   

Deque:









