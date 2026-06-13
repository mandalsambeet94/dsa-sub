class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hmap = new HashMap<>();
        int[] res = new int[k];

        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedArr = new ArrayList<>(hmap.keySet());

        sortedArr.sort((a,b) -> hmap.get(b) - hmap.get(a));

        for (int x= 0 ; x<k; x++) {
            res[x] = sortedArr.get(x);
        }

        return res;
    }
}
