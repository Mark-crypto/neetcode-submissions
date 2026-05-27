class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char valid = s.charAt(i);
            if(valid == '('){
                stack.push(')');
            }else if(valid == '['){
                stack.push(']');
            }else if(valid == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty() || stack.pop() != valid ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
