class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] finalArray=new int[n *2];
        for(int i=0;i<n;i++){
            int nextInd=i+n;
            finalArray[i]=nums[i];
            finalArray[nextInd]=nums[i];
        }
        return finalArray;
    }
}