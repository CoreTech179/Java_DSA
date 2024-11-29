public class Array_Problem_2 {
    public static void main(String[] args) {
        
        // Q.2 Check whether the a,rray is sorted in ascending order or not

        int [] numbers1 = {3,4,6,2};

        // int [] numbers2 = {1,2,3,4};

        boolean isSorted = false;

        // For number2 array

        // for(int i=0;i<(numbers2.length-1);i++){
        //     if(numbers2[i] < numbers2[i+1]){
        //         isSorted = true;
        //     }else{
        //         isSorted = false;
        //     }
        // }

        // For number1 array

        for(int i=0;i<(numbers1.length-1);i++){
            if(numbers1[i] < numbers1[i+1]){
                isSorted = true;
            }else{
                isSorted = false;
            }
        }

        if(isSorted==true){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
