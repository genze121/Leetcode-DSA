class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                sum = sum + (int)(Math.pow(n%10,2));
                n=n/10;
            }

            if(sum == 1) return true;

            n = sum;

            if(set.contains(n)) return false;
            set.add(n);
        }
    }
}