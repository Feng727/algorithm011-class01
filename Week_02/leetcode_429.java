class Solution {
    //bfs
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int sz = queue.size();
            for (int i=0; i<sz; i++) {
                Node curNode = queue.poll();
                level.add(curNode.val);
                for (Node child:curNode.children) {
                    if(child != null)
                        queue.offer(child);
                }
            }
            res.add(level);
        }
        return res;
    }
}