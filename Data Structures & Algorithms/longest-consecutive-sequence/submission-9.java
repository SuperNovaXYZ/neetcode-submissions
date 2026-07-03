class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum=nums[i];
            int currlength=1;
            
            boolean foundtrue= true;

            while(foundtrue){
            foundtrue=false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == currentNum + 1) {
                    currentNum++;
                    currlength++;
                    foundtrue=true;
                    
                }
            }
            }
            count=Math.max(count,currlength);
        }
        return count;
    }
}