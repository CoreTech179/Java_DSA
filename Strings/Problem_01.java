import java.lang.StringBuilder;

public class Problem_01 {
    public static void main(String[] args) {
        
        StringBuilder s1 = new StringBuilder("Hello World");

        String s2 = " ";
        for(int i=s1.length()-1;i>=0;i--){
            s2 += s1.charAt(i);
        }

        System.out.println(s2);
    }
}
