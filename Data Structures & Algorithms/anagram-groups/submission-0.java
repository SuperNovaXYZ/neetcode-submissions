class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String word : strs){
           char[] chars= word.toCharArray();
           Arrays.sort(chars);
           String key= new String(chars);

           List<String> gr = ans.get(key);

           if(gr==null){
            gr= new ArrayList<>();
            ans.put(key,gr);
           }

           gr.add(word);
        } return new ArrayList<>(ans.values());
    }
}