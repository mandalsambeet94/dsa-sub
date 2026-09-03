class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            hmap.put(nums[i], i);
        }

        for(int j =0; j<nums.length;j++) {
            int diff = target - nums[j];
            if(hmap.containsKey(diff) && j!= hmap.get(diff)) {
                return new int[]{j, hmap.get(diff)};
            }
        }
        return new int[]{};
    }
}
