class Solution {
    public boolean isPowerOfThree(int n) {
        // Approach - 1
        return n > 0 && 1162261467 % n == 0;

        // Approach - 2
        if(n == 0) return false;
        while(n!=1){
            if(n%3!=0) return false;
            n=n/3;
        }

        return (n==1);
    }
}
