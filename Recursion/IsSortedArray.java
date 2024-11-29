public class IsSortedArray {

    public static boolean isSorted(int [] array,int size){

        if(size==0 || size==1){
            return true;
        }

        if(array[size-1] < array[size-2]){
            return false;
        }
        else{
            boolean result = isSorted(array, size-1);
            return result;
        }

    }

    public static void main(String[] args) {
        
        int [] array = {1,2,5,6};
        int size = array.length;
        boolean result = isSorted(array,size);

        if(result){
            System.out.print("Array is Sorted");
        }
        else{
            System.out.print("Array is not Sorted");
        }

    }
}
