class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums3= new int[nums1.length+nums2.length];
        int index=0;
        
        for(int num : nums1){
            nums3[index]=num;
            index++;
        }

        for(int num : nums2){
            nums3[index]=num;
            index++;
        }

        Arrays.sort(nums3);



        int n = nums3.length;

        if (n % 2 == 1) {
            return nums3[n / 2];
        } else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;

            return (nums3[mid1] + nums3[mid2]) / 2.0;
        }
    }}
