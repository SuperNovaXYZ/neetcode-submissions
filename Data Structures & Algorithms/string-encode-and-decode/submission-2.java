class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();

        for (int i=0; i<strs.size(); i++){
            build.append(strs.get(i).length());
            build.append("#");
            build.append(strs.get(i));
            
        }

        return build.toString();
    }

    public List<String> decode(String str) {
      List<String> decoded = new ArrayList<>();
        int pointer=0;
        
        while(pointer<str.length()){
            int numberstart=pointer;
            while(str.charAt(pointer) != '#'){
            pointer++;
            }

        String number = str.substring(numberstart,pointer);
        int length = Integer.parseInt(number);

        int start= pointer + 1;
        int end= start + length;
        String word= str.substring(start,end);
        decoded.add(word);
        pointer=end;
        }
        return decoded;
    
    }
}







