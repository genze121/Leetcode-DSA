class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        
        while(num>9){
        int temp = num;
        int adder = 0;
        while(temp!=0){
            int remainder = temp%10;
            adder = adder + remainder;
            temp = temp/10;
        }
        num = adder;
        }

        return num;
        
    }
}