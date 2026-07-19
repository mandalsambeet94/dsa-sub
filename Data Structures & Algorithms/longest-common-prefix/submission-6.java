class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 1){
            return strs[0];
        }

        StringBuilder res = new StringBuilder(strs[0]);

        for(int i = 1; i< strs.length; i++) {
            int count = 0;
            if(strs[i].isEmpty()){
                //System.out.println("rewre");
                return "";
            }
            while(count < Math.min(res.length(),strs[i].length())) {
                if(res.charAt(count) != strs[i].charAt(count)){
                    
                    break;
                }
                count++;
            }
            res.delete(count, res.length());
        }
        return res.toString();
        
    }
}