class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
      /*   for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false; */

        Set<Integer> set = new HashSet<>();
        for(int duplicate : nums){
            if(!set.add(duplicate)) return true;
        }

        return false;
    }
}