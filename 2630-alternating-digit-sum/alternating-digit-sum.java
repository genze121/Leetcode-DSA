class Solution {
    public int alternateDigitSum(int n) {
        int digits = 0; //To count the number of digits in n
        int ans = 0; //The final answer
        while(n != 0){
            ans += (Math.pow(-1, (digits++))) * n%10;  //Math.pow determines the sign of digit at each step
            n /= 10;
        }
        return digits%2 == 0 ? -1*ans : ans;
    }
}