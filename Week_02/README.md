学习笔记
**哈希表、映射、集合**
哈希表（Hash table）：也叫散列表，是根据关键码值（Key value）而直接进行访问的数据结构。 
它通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度。

Map 和 Set 接口
Map接口：
Map(HashMap 和TreeMap)
HashMap:可以以(key, value)的形式实现对数据的快速查找，但是不保证顺序；
TreeSet:在实现Map接口的同时还实现了java.util.SortedMap接口，在使用TreeMap类实现Map接口在存储数据时需要对key进行排序，因此key不能为null;
方法：
	map.put​(K key, V value)
    map.get​(Object key)
    map.containsKey​(Object key)
    map.containsValue​(Object value)
    map.keySet()
    map.values()
    map.size()
    map.isEmpty()
	map.remove​(Object key)
Set接口：
Set(TreeSet 和 HashSet)
TreeSet:不允许有重复元素，在实现Set接口的同时还实现了java.util.SortedSet接口,默认按元素升序排列，可使用comparator接口实现定制排序；
HashSet:不允许有重复元素，但是元素无序
方法：
    Set.add​(E e)
        remove​(Object o)
        contains​(Object o)
        isEmpty()
        size()


**树、二叉树、二叉搜索树**
二叉搜索树：
判断：
查询一个节点：
插入：
删除： 若被删除节点是叶子节点，则直接删除即可；
      若被删除节点是根节点、子树根节点，则选取该根节点右子树最左端的节点

平衡二叉树：一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1。


       1
      / \
     2   2
    / \
   3   3
  / \
 4   4  

     false

    3          
   / \
  9  20
    /  \
   15   7
    
   true  

**堆**：
可以在一堆数中迅速找到最大者和最小者
二叉堆、斐波那契堆
二叉堆：通过完全二叉树(树的每一个节点都是满的，叶子节点可能不满)实现
性质：1.完全二叉树
     2.任意节点值>=节点值

  
    

