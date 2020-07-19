class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //将wordList放进Set里，便于后面判断产生的新节点是否在wordList内
        Set<String> wordset = new HashSet<>(wordList);
        if(wordset.size() == 0 || !wordset.contains(endWord)) return 0;
        //Queue:bfs的关键数据结构
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        //访问记录
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;
        int wordLen = beginWord.length();
        while(!q.isEmpty()) {
            int sz = q.size();
            for (int i=0; i<sz; i++) {
                String curWord = q.poll();
                char[] curWordArr = curWord.toCharArray();

                for (int j=0; j<wordLen; j++) {
                    char origin = curWordArr[j];
                    for (char c='a'; c<='z'; c++) {
                        if (c == curWordArr[j])
                            continue;
                        curWordArr[j] = c;
                        String nextWord = String.valueOf(curWordArr); //拼装新的单词
                        //检查新单词nextWord有没有在单词表wordset里
                        if (wordset.contains(nextWord)) {
                            if (nextWord.equals(endWord)) //终止条件
                                return step+1;
                            //判断nextWord是否被访问过
                            if (!visited.contains(nextWord)) {
                                q.offer(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    curWordArr[j] = origin; //恢复curWordArr[j]
                }
            }
            step++;
        }
        return 0;
    }
}