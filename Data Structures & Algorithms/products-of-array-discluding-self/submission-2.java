class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

       for (int i=0; i <nums.length; i++){
        int sum=1;
            for(int j=0; j<nums.length;j++){
                if(j!= i){
                    sum = sum * nums[j];
                output[i] = sum;}
            }
            
           }
    return output;
    }
}  
