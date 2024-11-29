public class SumOfNnaturalNumber {
    public static int addNnaturalNumber(int n){

        int sum = 0;

        if(sum==n){
            return 0;
        }

        sum = addNnaturalNumber(n) + addNnaturalNumber(n+1);
        return sum;

    }
    public static void main(String[] args) {
        
        int result = addNnaturalNumber(10);
        System.out.println(result);
    }
    
}
