import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {

        // Syntax for creation of Array

        // type [] arrayName = new type [size]; or, type arrayName [] = new type [size];  or, type arrayName [] = {element1, element2,....};

        // Q. Take input from the user in the form of an array and search for a specific element and print the index number

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] numbers = new int[size];

        // input
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        int searchNumber = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(searchNumber==numbers[i]){
                System.out.println("Index number: "+i);
                break;
            }
        }
        
        sc.close();
    }
}
