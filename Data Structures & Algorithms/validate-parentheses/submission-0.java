class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();

        for (int i=0;i<s.length();i++){
            char c= s.charAt(i);

            if(c== '[' || c== '{' || c=='('){
                str.push(c);
            }else{

            if(str.isEmpty()){
                return false;
            }

            char top = str.pop();

            if(c== ')' && top!='('){
                return false;
            }
            if(c== '}' && top!='{'){
                return false;
            }
            if(c== ']' && top!='['){
                return false;
            }}
        }
        return str.isEmpty();
    }
}
