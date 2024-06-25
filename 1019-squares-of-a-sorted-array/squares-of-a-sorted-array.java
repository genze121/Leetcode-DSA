class Solution {
    public int[] sortedSquares(int[] nums) {
        // Time Comnplexity - O(n + n^2), Space Complexity - O(n) [Extra space is being used]
    //     int[] temp = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //        temp[i] = nums[i]*nums[i];
    //     }
    //     for(int i=0;i<temp.length;i++){
    //         for(int j=i+1;j<temp.length;j++){
    //             if(temp[i] > temp[j]){
    //                 int val = temp[i];
    //                 temp[i] = temp[j];
    //                 temp[j] = val;
    //             }
    //         }
    //     }
    //    return temp;
     int newArray[] = new int[nums.length];

     for(int i=0;i<nums.length;i++){
        newArray[i] = nums[i] * nums[i];
     }

     Arrays.sort(newArray);

     return newArray;
    }
}