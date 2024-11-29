import java.util.Scanner;

public class Two_D_Array_01 {
    public static void main(String[] args) {
        
        // Declaration of 2-D array

        // type [][] arrayName = new type [rows][columns];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns:");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];

        // Input 
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Row number: " +i +" "+ "Column number: "+j +" " +"Element is = "+numbers[i][j]);
            }
        }


        sc.close();
    }
}
