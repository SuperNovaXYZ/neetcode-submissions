class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left=0;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c: s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        if(s1.length() > s2.length()){
        return false;
        }

        for(int right=0;right<s2.length();right++){
            char word= s2.charAt(right);
           
            map2.put(word,map2.getOrDefault(word,0)+1);
            
        
            
            int window= (right-left) +1;

            while(window > s1.length()){
                char leftchar= s2.charAt(left);
                map2.put(leftchar,map2.get(leftchar)-1);
                
           

            if(map2.get(leftchar) == 0){
                map2.remove(leftchar);
            }

            left++;
            window= right-left+1;
        }

        if(map1.equals(map2)){
            return true;
        }

        }
        return false;
    }
}
