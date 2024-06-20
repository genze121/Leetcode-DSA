class Solution {
    public int missingNumber(int[] nums) {
      if(nums.length == 0) return 0;
      int n = nums.length;
      int expectedTotal = n*(n+1)/2;
      int total = 0;
      for(int value : nums){
        total+=value;
      }

      return expectedTotal - total;
    }
}