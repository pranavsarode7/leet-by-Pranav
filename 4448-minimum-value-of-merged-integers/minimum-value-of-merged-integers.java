
class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {
            int b = nums[i + 1];

            int digits = String.valueOf(b).length();

            int merged = nums[i] * (int)Math.pow(10, digits) + b;

            min = Math.min(min, merged);
        }

        return min;
    }
}
