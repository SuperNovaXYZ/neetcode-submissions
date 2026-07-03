class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder w = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
            w.append(c);
        }}

        return w.toString().toLowerCase().equals(w.reverse().toString().toLowerCase());
    }
}
