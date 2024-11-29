public class Sorting {
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int [] array = {7,8,3,1,2};

        // Bubble sort --> Bubble means here every element is just like a bubble where the lowest number is placed at the 1st position and the highest number is placed at the end position

        // for(int i=0;i<array.length;i++){

        //     for(int j=0;j<array.length-i-1;j++){

        //         //condition is --> (array.length-i-1) because we know after every iteration 1 element is sorted therefore we will not compare with that element. Here that variable i controls the number of element that is already sorted.
                
        //         if(array[j]>array[j+1]){
        //             // Here we are comparing with 2 elements of the array (i.e. 7 > 8 = no then ignore, again 8 > 3 = yes then swap, again 8>1 = yes then swap, again 8>2 = yes then swap )
        //             // swap
        //             int temp = array[j];
        //             array[j] = array[j+1];
        //             array[j+1] = temp;
        //         }
        //     }
        // }



        // Selection Sort

        // Note: After every iteration we are selecting only one element by increasing the i counter and comparing with rest of the array & swap for a single time

        // for(int i=0;i<array.length;i++){
        //     int min = i;
        //     for(int j=i+1;j<array.length;j++){
        //         if(array[j]<array[min]){
        //             min = j;
        //         }
        //     }
        //     int temp = array[i];
        //     array[i] = array[min];
        //     array[min] = temp;

        // }


        // Insertion sort --> hamne initially array ka 1st element jeb me rak liya fir hamlogo ne comparison 2nd element se karna suru kar diya.

        // for(int i=1;i<array.length;i++){
        //     // har ek bar element pick karke store kar le raha hu
        //     int element = array[i];
        //     // 2nd loop utla chalega i-1 se 0 tak --> reverse me array compare karte karte jaienge isliye
        //     int j = i-1;
        //     for(;j>=0;j--){
        //         if(element<array[j]){
        //             // shift kar le 1 place
        //             array[j+1] = array[j];
        //         }else{
        //             break;
        //         }
        //     }
        //     array[j+1] = element;
        // }

        printArray(array);
    }
}
