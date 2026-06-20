class Solution {
    public int maxArea(int[] heights) {

        int l= 0, r= heights.length-1, max = 0;
        while (l< r) {
            int can_contain = (r-l) * Math.min(heights[l],heights[r]);
            max = Math.max(can_contain, max);

           if(heights[l] > heights[r]) {
            r--;
           } else{
            l++;
           }
            
        }
        return max;

        
    }
}
