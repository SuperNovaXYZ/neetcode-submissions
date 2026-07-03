class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fixed = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int j = s.length() - 1; j >= 0; j--) {
            char chara = s.charAt(j);
            
            if(Character.isLetterOrDigit(chara)){
             fixed.append(Character.toLowerCase(chara));    
            }
           
        }

        String result = fixed.toString();

        for (int i=0; i<s.length(); i++){

             if(Character.isLetterOrDigit(s.charAt(i))){
             word.append(Character.toLowerCase(s.charAt(i)));    
            }
        }
        String regular= word.toString();

        if(result.equals(regular)){
            return true;
        } else{
            return false;
        }
    }
}