class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> map = new HashMap<String, List>();
        for (String s : strs) {
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            String k = String.valueOf(s1);
            if (!map.containsKey(k))
                map.put(k, new ArrayList());
            map.get(k).add(s);
        }
        return new ArrayList(map.values());
    }
}
