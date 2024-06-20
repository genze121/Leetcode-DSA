class Solution {
    public int trailingZeroes(int n) {
       int countZeros = 0;
       for(int i=5;i<=n;i=i*5){
          countZeros = countZeros + n/i;
       }
       return countZeros;
    }
}