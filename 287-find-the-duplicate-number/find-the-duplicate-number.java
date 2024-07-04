class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return nums[i];
        //     }
        //     set.add(nums[i]);
        // }

        // return -1;

        int duplicateNumber = 0;
       Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                duplicateNumber = nums[i];
            }
        }
        return duplicateNumber;
    }
       
}