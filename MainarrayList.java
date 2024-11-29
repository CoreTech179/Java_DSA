import java.util.ArrayList;
import java.util.Collections;

public class MainarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        // Adding elements to the arrayList
        array.add(5);
        array.add(7);
        array.add(3);
        array.add(8);
        array.add(1);

        // Printing the entire arrayList
        System.out.println(array);

        // Printing the size of the arrayList
        int size = array.size();
        System.out.println(size);


        // retrieving the List elements one by one
        for(int i=0;i<array.size();i++){
            System.out.print(array.get(i) +" ");
        }

        System.out.println();
        // Checking an particular element present at the arrayList or not
        boolean check = false;
        check = array.contains(100);
        System.out.println(check);

        // Adding an element to its specific position
        array.add(2, 100);
        System.out.println(array);

        // removing an specific element
        array.remove(2);
        System.out.println(array);

        // Sorting the array List
        Collections.sort(array);
        System.out.println(array);
    }
}
