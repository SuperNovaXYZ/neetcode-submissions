class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> hm = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for (int i=0; i< s.length(); i++){
            char c= s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for (int i=0; i<t.length();i++){
            char c2 = t.charAt(i);
            if(!hm.containsKey(c2)){
                return false;
            }
            hm.put(c2,hm.get(c2)-1);

            if(hm.get(c2)==0){
                hm.remove(c2);
            }

           

        }
        return hm.isEmpty();
    }
}
