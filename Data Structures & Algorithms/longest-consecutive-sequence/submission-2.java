class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        int count =1, max_count=0;
        for (int num : s) {
            int next_val = 0;
            if (s.contains(num + 1)) {
                count += 1;
                next_val = num + 1;
                while (s.contains(next_val + 1)) {
                    count++;
                    next_val++;
                }
            }
            max_count = Math.max(count, max_count);
            count= 1;
        }
        return max_count;
    }
}
