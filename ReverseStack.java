import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        ArrayList<Integer> array = new ArrayList<Integer>();

        while(!s.empty()){
            int element = s.pop();
            array.add(element);
        }

        for(int i=0;i<array.size();i++){
            s.push(array.get(i));
        }

        while(!s.empty()){
            int number = s.pop();
            System.out.println(number);
        }

    }
}
