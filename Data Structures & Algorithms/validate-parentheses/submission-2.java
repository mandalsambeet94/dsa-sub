class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i <s.length(); i++) {
            if (closeToOpen.containsKey(s.charAt(i)) && !stack.isEmpty() && 
            closeToOpen.get(s.charAt(i)) == stack.peek()) {
                    stack.pop();

            }
            else{
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
