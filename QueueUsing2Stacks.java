import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsing2Stacks {

    static class classQueue{

        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }

            s1.add(data);

            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }

        public static int remove(){

            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            int element = q.remove();
            System.out.println(element);
        }
    }
}
