class Solution {
    public boolean checkPerfectNumber(int num) {

       // Approach - 1
       int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        
        if(sum == num) return true;
        else return false;
    }

    // Approach - 2
    if(num == 0 || num == 1) return false;
    int sum = 0;
    for(int i=2;i*i<=num;i++){
        if(num%i == 0) {
            sum = sum + i + num/i;
        }
    }
    sum++;
    return (sum == num);
}
