class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            char c = tokens[i].charAt(0);
            if(tokens[i].length() == 1 && (c == '+' || c == '-' || c == '*' || c == '/')) {
                int op2 = s.pop();
                int op1 = s.pop();
                if(c == '+') {s.push(op1 + op2);}
                else if (c == '-') {s.push(op1 - op2);}
                else if(c == '*') {s.push(op1 * op2);}
                else {s.push(op1 / op2);}
            }
            else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
