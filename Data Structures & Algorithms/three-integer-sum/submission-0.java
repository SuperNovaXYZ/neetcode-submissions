class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(); 
            
            
            for(int i =0; i<nums.length; i++){

                 for(int j=i+1; j<nums.length; j++){

                         for(int k =j+1; k<nums.length; k++){
                            if(nums[i] + nums[j] + nums[k] == 0  ){
                                ArrayList<Integer> completeList = new ArrayList<>();
                                completeList.add(nums[i]);
                                completeList.add(nums[j]);
                                completeList.add(nums[k]);

                                Collections.sort(completeList);
                                if(!res.contains(completeList)){
                                res.add(completeList);
                                }
                            }
                            
            }

          }
          
        }

            return res;
    }
}
