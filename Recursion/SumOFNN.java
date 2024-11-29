import java.util.Scanner;

public class SumOFNN {

    public static void SumNN(int number,int start,int sum){

        if(start==number){
            sum+=start;
            System.out.println(sum);
            return;
        }

        sum+=start;
        SumNN(number, start+1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");

        int n = sc.nextInt();

        SumNN(n,1,0);

        sc.close();
    }
}
