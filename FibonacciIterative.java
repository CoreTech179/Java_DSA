import java.util.Scanner;

public class FibonacciIterative {

    public static void FiboIterative(int a, int b, int nTerm){

        System.out.println(a);
        System.out.println(b);

        int a1 = a;
        int b1 = b;

        int i = nTerm;
        
        while(i!=0){
            int c = a1 + b1;
            System.out.println(c);
            a1 = b1;
            b1 = c;
            i--;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.print("Enter any number:");
        int term = sc.nextInt();

        FiboIterative(a,b,term-2);

        sc.close();
    }
}
