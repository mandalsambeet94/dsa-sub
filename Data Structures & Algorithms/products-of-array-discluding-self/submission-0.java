class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero_counter = 0;
        int counter_index = 0;
        for (int i=0;i<nums.length; i++) {
            if(nums[i] !=0) {
                product*=nums[i];
            }
            else{
                zero_counter++;
                counter_index = i;
            }

        }
        
        if(zero_counter == 0) {
            for(int i=0;i<nums.length; i++){
                if(nums[i] !=0){
                    nums[i] = product/nums[i];
                }
            }
        }
        else if(zero_counter == 1) {
            int arr[] = new int[nums.length];
            arr[counter_index] = product;
            return arr;
        }
        else {
            return new int[nums.length];
        }
        return nums;
    }
}  
