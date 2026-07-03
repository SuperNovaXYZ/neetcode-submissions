class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        // Use <= so we don't miss the answer when the walls collide
        while (left <= right) {
            int middle = (left + right) / 2;
            int middleNum = nums[middle];
            
            if (middleNum == target) {
                return middle; // Found it!
            }
            
            // STEP 1: Check if the LEFT side is perfectly smooth
            if (nums[left] <= middleNum) {
                // Is the target sitting on this smooth left hill?
                if (nums[left] <= target && target < middleNum) {
                    right = middle - 1; // Yes! Move right wall backward to search it
                } else {
                    left = middle + 1;  // No! Chop it off, target must be on the right
                }
            } 
            // STEP 2: Otherwise, the RIGHT side MUST be perfectly smooth
            else {
                // Is the target sitting on this smooth right hill?
                if (middleNum < target && target <= nums[right]) {
                    left = middle + 1;  // Yes! Move left wall forward to search it
                } else {
                    right = middle - 1; // No! Chop it off, target must be on the left
                }
            }
        }
        return -1; // Target doesn't exist anywhere
    }
}