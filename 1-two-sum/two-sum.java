class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            Integer complimentIndex = map.get(nums[i]);
            if (complimentIndex != null) {
                return new int[] { i, complimentIndex };
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}