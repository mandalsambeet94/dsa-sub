class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> hmap = new HashMap<>();

        for(int i = 0; i< strs.length; i++) {
            String key = sort_str(strs[i]);
            if (hmap.containsKey(key)) {
                hmap.get(key).add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hmap.put(key, list);
            }
        }
        for (Map.Entry<String, List<String>> val : hmap.entrySet()) {
            res.add(val.getValue());
        }

        return res;


        
    }

    public String sort_str(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
