public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    static int fib(int n ){
        if(n<=1){
            return 1;
        }
        int slow =fib(n-1);
        int fast = fib(n-2);

        return slow + fast;
    }
}
