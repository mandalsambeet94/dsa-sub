class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int r = Arrays.stream(piles).max().getAsInt(), l=1, res= 0, calc_hours= 0;

        while(l<=r) {
            int mid = l+(r-l)/2;
            calc_hours = 0;
            for (int i=0; i< piles.length; i++) {
                calc_hours += (int) Math.ceil((double)piles[i]/mid);
            }
            if(calc_hours <= h){
                res = mid;
                r= mid -1;
            }
            else {
                l = mid +1;
            }
        }
        return l;
        
    }
}
