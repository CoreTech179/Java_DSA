import java.util.Scanner;

public class PowerX {

    public static int Powerx(int x,int n){

        if(n==0){
            return 1;
        }

        return x * Powerx(x,n-1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x:");
        int x = sc.nextInt();

        System.out.print("Enter any number:");
        int number = sc.nextInt();

        int result = Powerx(x,number);

        System.out.println(result);

        sc.close();

    }
}
