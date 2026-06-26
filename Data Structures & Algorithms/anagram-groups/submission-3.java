class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

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
        

        return new ArrayList<>(hmap.values());


        
    }

    public String sort_str(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
