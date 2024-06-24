class Solution {
    public List<String> fizzBuzz(int n) {

        // Approach - 1
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
               list.add(String.valueOf(i));
            }
        }

        return list;

        //  // Approach - 2
        // for(int i=1;i<=n;i++){
        //     list.add(
        //         i%3==0 && i%5==0 ? "FizzBuzz" :
        //         i%3==0 ? "Fizz" :
        //         i%5==0 ? "Buzz" : String.valueOf(i)
        //     );
        // }

        // return list;
    }
}