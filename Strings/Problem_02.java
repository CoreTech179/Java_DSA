import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char [] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        char s2 = 'a';
        int number = 10;

        for(int i=0;i<array.length;i++){
            if(s2==array[i]){
                System.out.println(number + i);
                break;
            }
        }

        sc.close();
    }
}
