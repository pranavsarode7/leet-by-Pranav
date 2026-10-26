class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flagA=false;
        boolean flagD=false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (flagD==true) {
                    return false;
                }
                flagA = true;
            } else if (nums[i] < nums[i - 1]) {
                if (flagA==true) {
                    return false;
                }
                flagD = true;
            }
        }
        return true;
    }
}