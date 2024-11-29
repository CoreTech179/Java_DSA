public class Fibonacci {

    public static int FibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int ans = FibonacciSeries(n-1) + FibonacciSeries(n-2);
        return ans;
    }

    

    public static void main(String[] args) {

        int result = FibonacciSeries(4);

        System.out.println(result);
    }
}
