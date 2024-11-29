import java.util.Scanner;

public class Two_D_Array_Problem_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int numbers [][] = new int[row][column];

        // Input
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // Traspose of matrix

        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
