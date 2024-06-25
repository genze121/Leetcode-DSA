class Solution {
    public int countDigits(int num) {
       if(num == 0) return 0;

       int temp = num;
       int divide = 0;
       while(temp!=0){
        int remainder = temp%10;
        if(num%remainder == 0){
            divide++;
        }
        temp = temp/10;
       }

       return divide;
    }
}