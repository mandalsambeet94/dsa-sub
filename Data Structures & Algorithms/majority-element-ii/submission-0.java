class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap();
        List<Integer> res = new ArrayList();
        for(int x: nums) {
            hmap.put(x, hmap.getOrDefault(x, 0)+1);
        }
        System.out.println(hmap);
        int moreThan = nums.length / 3;
        for(Map.Entry<Integer, Integer> x : hmap.entrySet()) {
            if(x.getValue() > moreThan) {
                res.add(x.getKey());
            }
        }
        return res;
    }
}