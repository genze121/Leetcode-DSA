class Solution {
    public void sortColors(int[] nums) {
        // Approach - 1 => Using sort() inbuilt method
        // Arrays.sort(nums);

        // Approach - 2 => Using two loops.
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
}