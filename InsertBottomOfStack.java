import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class InsertBottomOfStack {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.print("Enter any element:");
        int element =sc.nextInt(); 

        while(!s.empty()){
            int number = s.pop();
            array.add(number);
        }

        Collections.sort(array);

        s.push(element);

        for(int i=0;i<array.size();i++){
            s.push(array.get(i));
        }

        while (!s.empty()) {
            int number = s.peek();
            s.pop();
            System.out.println(number);
        }

        sc.close();
    }
}
