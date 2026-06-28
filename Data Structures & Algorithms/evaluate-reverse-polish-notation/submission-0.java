class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> strStack = new Stack<>();
        List<String> strArr = new ArrayList<>();
        strArr.add("*");
        strArr.add("-");
        strArr.add("+");
        strArr.add("/");
        int res = 0;
        
        for ( String s : tokens) {
            if (strArr.contains(s) && !strStack.isEmpty()) {
                int first = strStack.pop();
                int second = strStack.pop();
                res = calc_expression(first, second, s);
                strStack.push(res);
            }
            else{
                strStack.push(Integer.valueOf(s));
            }
        }   
        return strStack.pop();
    }

    public int calc_expression(int a, int b, String operator){
        int result = 0;
        if (operator.equals("*")) {
            result = a * b;
        }
        if (operator.equals("+")) {
            result = a + b;
        }
        if (operator.equals("-")) {
            result = b-a;
        }
        if (operator.equals("/")) {
            result = b/a;
        }
        return result;
    }
}
