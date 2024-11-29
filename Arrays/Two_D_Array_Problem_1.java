import java.util.Scanner;

public class Two_D_Array_Problem_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Q. Take a matrix as an input from the user and search for a given number x and print the index number where it occurs.

        System.out.print("Enter number of row:");
        int row = sc.nextInt();
        System.out.print("Enter number of columns:");
        int column = sc.nextInt();

        int numbers [][] = new int [row][column];

        // Input
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search:");
        int searchNumber = sc.nextInt();

        // Searching

        int indexNumberRow = 0;
        int indexNumberColumn = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(numbers[i][j]==searchNumber){
                    System.out.println("Match found!");
                    indexNumberRow = i;
                    indexNumberColumn = j;
                    break;
                }
            }
        }

        System.out.println("Row Number is "+indexNumberRow +" " +"Column Number is "+indexNumberColumn);

        sc.close();
    }
}
