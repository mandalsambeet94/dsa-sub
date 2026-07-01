class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r= nums.length-1;

        while(l<= r) {
            int mid = l+(r-l)/2;
            if(target == nums[mid]) {
                return mid;
            }
            else if( target > mid) {
                l++;
            }
            else{
                r--;
            }
        }
        return -1;
    }
}
