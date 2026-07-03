class Solution {
    public int search(int[] nums, int target) {

           if (nums == null || nums.length == 0) return -1;
        
        int left=0;
        int right= nums.length-1;


        if(nums.length==1 && target==nums[0]){
            return 0;
        }

        while(left<=right){
            int middle= left + (right - left) / 2;
            int middleNumber= nums[middle];

            if(middleNumber == target){
                return middle;
            }


            if(target< middleNumber){
                right=middle-1;
            }else{
                left=middle+1;
            }

            


        }

        return -1;
    }
}
