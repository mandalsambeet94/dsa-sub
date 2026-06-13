class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String res : strs) {
            if ("".equals(res)){
                sb.append("-1");
            }
            else{
                sb.append(calulate_ascii(res));
            }
            sb.append(":");
        }
        return sb.substring(0, sb.length()-1);

    }

    public List<String> decode(String str) {
    
        String[] arr = str.isEmpty() ? new String[0] : str.split(":");
        List<String> res = new ArrayList<>();

        for(String val : arr) {
            res.add(decode_ascii(val));
        }

        return res;

    }

    public static String calulate_ascii(String str) {
        StringBuilder sum = new StringBuilder();
        for(int i = 0; i< str.length(); i++) {
            sum.append((int) str.charAt(i));
            sum.append("&");
        }
        return sum.substring(0, sum.length()-1);
    }

    public static String decode_ascii(String str) {
        if ("-1".equals(str)){
            return "";
        }
        String[] arr = str.split("&");
        StringBuilder sb = new StringBuilder();

        for (String res: arr) {
            int val = Integer.parseInt(res);
            char x = (char) val;

            sb.append(x);
        }
        return sb.toString();
    }
}
