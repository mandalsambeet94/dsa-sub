class Solution {
    public int findMin(int[] nums) {

        int l =0, r = nums.length-1, mid = 0;

        while(l<r) {
            mid = l+(r-l)/2; // 2 4
            if(nums[mid] < nums[r]) {
                r = mid ; // 3
            }
            else {
                l= mid+1;
            }
        }

        return nums[l];
        
    }
}
