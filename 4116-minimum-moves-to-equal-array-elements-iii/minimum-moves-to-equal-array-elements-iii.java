class Solution {
    public int minMoves(int[] nums) {
    Arrays.sort(nums);
      int maxi=nums[nums.length-1];
      int sum=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==maxi){
            continue;
        }
        sum=(maxi-nums[i])+sum;
      }
      return sum;  
    }
}