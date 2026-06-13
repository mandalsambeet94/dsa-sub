class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        //Set<Integer> s = new HashSet<>(nums);
        int count = 1;
        int max_count = 0;

        for(int i=0; i< nums.length -1; i++){
            //System.out.println("for i= "+ nums[i]);
            if( nums[i]+1 == nums[i+1]){
               // System.out.println("inside");
                count++;
            }
            else if (nums[i] == nums[i+1]){
                //continue;
            }
            else{
                //System.out.println("inside els");
                if (count > max_count){
                    max_count = count;
                }
                count = 1;
            }
        }
        return Math.max(count, max_count);
    }
}
