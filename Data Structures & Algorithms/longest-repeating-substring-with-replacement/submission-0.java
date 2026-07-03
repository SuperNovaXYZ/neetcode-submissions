class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char word = s.charAt(right);

            map.put(word, map.getOrDefault(word, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(word));

            int window = right - left + 1;

            if (window - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}