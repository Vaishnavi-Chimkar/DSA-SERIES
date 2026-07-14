class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); 
        for(int i = 0;i<s.length();i++){
            char top = s.charAt(i);
            if( top =='(' || top == '{' || top =='['){
                st.push(top);
            }else{

                if(st.isEmpty()){
                    return false;
                }

                if(top == ')' && st.peek()!='('){
                    return false;
                }

                if(top == '}' && st.peek()!='{'){
                    return false;
                }

                if(top == ']' && st.peek()!='['){
                    return false;
                }

                st.pop();

            }
        }

        return st.isEmpty();
    }
}