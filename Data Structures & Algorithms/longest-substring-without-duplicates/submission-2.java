class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left=0;
        int max=0;

        HashSet<Character> set =new HashSet<>();

        for(int right=0; right<s.length();right++){
            char word=s.charAt(right);

            while(set.contains(word)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(word);
            max=Math.max(max,set.size());


        }
        return max;
    }
}
