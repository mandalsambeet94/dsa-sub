class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap();
        int l=0;
        for(int i =0; i< nums.length; i++) {
            if(hmap.containsKey(nums[i])){
                //System.out.println(hmap.get(nums[i]));
                if(Math.abs(i - hmap.get(nums[i])) <= k){
                    return true;
                }
            }
            hmap.put(nums[i], i);
        }
        //System.out.println(hmap);

        return false;
    }
}