class Solution {
    public boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray();

        char[] second = t.toCharArray();

       Arrays.sort(first);
       Arrays.sort(second);
            
            if(first.length != second.length){
                return false;
            }
        
        return Arrays.equals(first,second);
    }
}
