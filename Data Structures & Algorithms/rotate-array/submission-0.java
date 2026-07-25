class Solution {
    public void rotate(int[] nums, int k) {

        int[] temp = new int[nums.length];
        int n = nums.length;

        for(int i =0; i<n; i++) {
            temp[(i+k)%n] = nums[i];
        }

        for(int j = 0; j< n; j++) {
            nums[j] = temp[j];
        }

        
    }
}