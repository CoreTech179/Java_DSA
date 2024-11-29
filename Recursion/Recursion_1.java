public class Recursion_1 {

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }

        int smallerProblem = Factorial(n-1);
        int biggerProblem = n * smallerProblem;

        return biggerProblem;
    }

    public static void main(String[] args) {
        int result = Factorial(3);
        System.out.println("Ans is = " +result);
    }
}
