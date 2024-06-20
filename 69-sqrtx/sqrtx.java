class Solution {
    public int mySqrt(int x) {
    //     long result = 0;
    //     while(result*result<=x) result++;
    //     return (int)(result-1);
    // }

    long start = 0;
    long end = x;
    long ans = 0;
    while(start<=end){
        long mid = start + (end-start)/2;
        if(mid*mid<=x){
            ans = mid;
            start=mid+1;
        }else{
            end=mid-1;
        }
    }

    return (int)(ans);
    }
}