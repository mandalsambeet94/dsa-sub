class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = arr[0];
        int l = 0, r= 1;
        int avgCount= 0;

        if (k ==1) {
            for (int val : arr) {
                if (val >= threshold) {
                    avgCount++;
                }
            }
            return avgCount;
        }

        while (r< arr.length) {
            if (r - l == k-1) {
                sum+=arr[r];
                if(sum/k >= threshold) {
                    avgCount++;
                }
                sum-=arr[l];
                l++;r++;
            }
            else {
            sum += arr[r];
            r++; }
        }
        return avgCount;
    }
}