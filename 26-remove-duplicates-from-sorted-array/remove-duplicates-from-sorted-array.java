class Solution {
    public int removeDuplicates(int[] nums) {
        // Brute Force / Naive Approach => Time Complexity = O(n), Space Complexity = O(n)
        // int n = nums.length;
        // int[] temp = new int[n]; // extra space
        // temp[0] = nums[0];
        // int result = 1;
        // for(int i=1;i<n;i++){
        //     if(temp[result-1]!=nums[i]){
        //         temp[result] = nums[i];
        //         result++;
        //     }
        // }

        // for(int i=0;i<result;i++){
        //     nums[i] = temp[i];
        // }   

        // return result;

        // Efficient Approach => Time Complexity = O(n), Space Complexity = O(1)

        int result = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[result-1]){
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }
}