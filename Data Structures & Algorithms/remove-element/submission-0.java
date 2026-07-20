class Solution {
    public int removeElement(int[] nums, int val) {

        int L = nums.length -1;

        for(int R = nums.length -1; R >=0; R--){
            if(nums[R] == val) {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
                L--;
            }
        }
        for(int i = 0; i< nums.length;i++) {
            System.out.println(nums[i]);
        }
        return L+1;
        
    }
}