class MinStack {
    private final Stack<Integer> stack;
    private final List<Integer> arr;
    public MinStack() {
        this.stack = new Stack<>();
        this.arr = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.push(val);
        arr.add(val);
    }
    
    public void pop() {
        stack.pop();
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        List<Integer> arr2 = new ArrayList<>(arr);
        Collections.sort(arr2);
        return arr2.get(0);
    }
}
