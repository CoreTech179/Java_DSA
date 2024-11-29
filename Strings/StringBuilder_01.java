import java.lang.StringBuilder;

public class StringBuilder_01 {
    public static void main(String[] args) {
        // Basically we use String builder to optimally use the string operations.
        
        // Declaration of String Builder

        StringBuilder s1 = new StringBuilder("tony Stark");

        // Find the length of the String

        // System.out.println(s1.length());

        // Printing the characters of the String one by one

        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i) +" ");
        }

        System.out.println();

        // Replacing any old character with new character inside the string

        s1.setCharAt(2,'s');
        System.out.println(s1);

        // Inserting a character at specified position

        s1.insert(2, 'n');
        System.out.println(s1);

        // Deleting Character at specified position

        s1.delete(3, 4);
        System.out.println(s1);


        // Adding characters at the end of the String
        
        s1.append("stark");
        s1.append("wolf");

        System.out.println(s1);
    }
}
