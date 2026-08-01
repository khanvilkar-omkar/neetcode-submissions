class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        for (String c:tokens){
            if(c.equals("+")){
                int b = values.pop();
                int a = values.pop();
                values.push(a+b);
            }else if(c.equals("-")){
                int b = values.pop();
                int a = values.pop();
                values.push(a-b);
            }else if(c.equals("*")){
                int b = values.pop();
                int a = values.pop();
                values.push(a*b);
            }else if(c.equals("/")){
                int b = values.pop();
                int a = values.pop();
                values.push(a/b);
            }else{
                values.push(Integer.parseInt(c));
            }
        }
        return values.pop();
    }
}
