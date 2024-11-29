import java.util.Scanner;

// Q.1. Find the maximum and minimum number from the array
public class Array_Problem_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = sc.nextInt();

        // declaring an array
        int [] numbers = new int[size];

        // Input
        System.out.print("Enter the array elements:");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        int min = 999;
        int max = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){

                min = numbers[i];

            }else if(numbers[i]>max){

                max = numbers[i];

            }
        }

        System.out.println("Minimum number = "+min +" " +"Maximum number = "+max);
        sc.close();
    }
}
