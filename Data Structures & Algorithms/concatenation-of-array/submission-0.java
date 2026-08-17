class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int i =0, j=0;
        while(i<nums.length) {
            ans[i] = nums[i];
            i++;
        }
        while(i<ans.length) {
            ans[i] = nums[j];
            i++;j++;
        }
        return ans;
    }
}