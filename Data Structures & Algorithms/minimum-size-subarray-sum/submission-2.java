class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0] >= target) {
            return 1;
        }
        int l = 0,r=1, min_count=Integer.MAX_VALUE;
        int sum = nums[l]+nums[r];
        while(l<r) {
            System.out.println(min_count);
            if(nums[r] >= target ) return 1;
            if(sum >= target) {
                min_count = Math.min(min_count, r-l+1);
                sum-=nums[l];
                l++;
            }
            else{
                if(r == nums.length - 1) {
                    sum-=nums[l];
                    l++;
                } else {
                    r++;
                    sum+=nums[r];
                }
                
            }
        }
        return min_count == Integer.MAX_VALUE ? 0 : min_count;
        
    }
}