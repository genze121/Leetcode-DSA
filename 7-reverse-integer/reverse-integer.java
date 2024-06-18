class Solution {
    public int reverse(int x) {
       int temp = x;
       int reverse = 0;

       while(temp!=0){
         int remainder = temp%10; 
         if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) return 0;
         reverse = reverse * 10 + remainder; 
         temp = temp/10; 
       }

       return reverse;
    }
}