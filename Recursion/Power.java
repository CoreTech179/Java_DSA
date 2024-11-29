public class Power {
    public static int Power2(int n){
        // Base case where we need to stop the recursion
        if(n==0){
            return 1;
        }
        // 2^n || n = 1,2,3....
        // 2^3 = 2 * 2^(3-1) => 2 * 2^2 => 8
         
        int smallerProblem = Power2(n-1);
        int biggerProblem = 2 * smallerProblem;

        return biggerProblem;
    }
    public static void main(String[] args) {
        int result = Power2(3);
        System.out.println(result);
    }
}
