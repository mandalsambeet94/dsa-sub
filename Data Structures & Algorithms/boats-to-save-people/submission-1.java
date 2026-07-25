class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int l = 0, r = people.length-1,count=0;

        while(l<r) {
            if(people[r] == limit) {
                count++; r--;
            }
            else if(people[l]+ people[r] <= limit) {
                count++; l++; r--;
            }
            else{
                count++;
                r--;
            }

        }
        if(l==r) count+=1;
        return count;
        
    }
}