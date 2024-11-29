import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        // Declaration of String

        // String s1 = "Tony";

        // System.out.println(s1);

        // Declaring Scanner class for taking input from the keyboard
        Scanner sc = new Scanner(System.in);
        
        // If I want to take a single word as an input than we use .next() function

        // String s2 = sc.next();
        // System.out.println(s2);

        // If I want to take an entire sentence we use .nextLine() function

        // String s3 = sc.nextLine();
        // System.out.println(s3);

        // Printing each an every character one by one by using .charAt() function

        // String s1 = "tony stark";
        // for(int i=0;i<s1.length();i++){
        //     System.out.print(s1.charAt(i) +" ");
        // }


        // Length of the string can be find out using .length() function

        // String s1 = "tony";
        // System.out.println(s1.length());


        // Comparing 2 Strings

        // String s1 = "tony";
        // String s2 = "Tony"; // Strings are case sensetive
        // String s2 = "stark";

        // if(s1.equals(s2)){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not equal");
        // }


        // Return a substring from the actual string using .substring(startIndex,endIndex);
        String s1 = "tony stark";
        // System.out.println(s1.substring(5)); // with starting index & by deafult ending index is the end of the String

        // with both starting and ending index, where starting index is inclusive and ending index is exclusive
        System.out.println(s1.substring(5,8));

        

        sc.close();
    }
}
