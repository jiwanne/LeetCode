class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
        
            if(nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna