class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        for ( int i=0; i<nums.length-1;i++){
            int number = nums[i];
           if(number == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}