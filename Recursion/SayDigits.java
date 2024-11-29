import java.util.Scanner;

public class SayDigits {

    public static void sayNumber(int number,String [] array){

        if(number==0){
            return; 
        }

        int digit = number % 10;

        number = number / 10;
        
        sayNumber(number,array);
        
        System.out.println(array[digit]);

    }
    
    public static void main(String[] args) {

        String [] array = new String[]{"zero","one","two","three","four","five","Six","seven","eight","nine"};
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt(); //412

        sayNumber(number, array);

        sc.close();
    }
}
