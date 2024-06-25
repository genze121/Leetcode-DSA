class Solution {
    public int[] sortedSquares(int[] nums) {
    // Approach - 1
    // Time Complexity - O(n + n^2), Space Complexity - O(n) [Extra space is being used here.]
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           temp[i] = nums[i]*nums[i];
        }
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i] > temp[j]){
                    int val = temp[i];
                    temp[i] = temp[j];
                    temp[j] = val;
                }
            }
        }
       return temp;

    // Approach - 2
     // Time Complexity - O(n), Space Complexity - O(1) [Extra space is not being used here.]
     for(int i=0;i<nums.length;i++){
        nums[i] = nums[i] * nums[i];
     }

     Arrays.sort(nums);

     return nums;
    }
}
