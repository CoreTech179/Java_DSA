public class First_and_last_Occurance {
    public static int firstOccurance(int [] array, int key){

        int start = 0;
        int end = (array.length-1);

        int mid = (start + end) / 2;

        int ans = -1;

        // Pura binary search ka code same rahega lekin change sib eek jagha ayega. jab mid ka value key ke equal ho jata tha binary search me to ham log uuska index retun mar dete the kuye ki bhaiya eek hi element hame search karna parta tha orr eek hi element array me bhi tha. But iss array me duplicates key hoga oor hame diya gaya he ki 1st  key ka occurance nikalna he isliye end ko "mid - 1" karte rahenge jab tak 1st occurance mil na jaye.

        // Same fanda last ke liye bas start ko "mid + 1" karte rahenge jab tak last occurance nehe mil jata
        while(start <= end){
            if(key == array[mid]){
                ans = mid;
                end = mid - 1;
            }
            else if(key > array[mid]){
                start = mid + 1 ;
            }
            else if(key < array[mid]){
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }
        return ans;
    }

    public static int lastOccurance(int [] array, int key){

        int start = 0;
        int end = (array.length-1);

        int mid = (start + end) / 2;

        int ans = -1;

        while(start <= end){
            if(key == array[mid]){
                ans = mid;
                start = mid + 1;
            }
            else if(key > array[mid]){
                start = mid + 1 ;
            }
            else if(key < array[mid]){
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int [] array = {1,2,3,3,5};

        int indexFirstOccurance = firstOccurance(array, 3);
        int indexLastOccurance = lastOccurance(array, 3);

        System.out.println("First occurance is = "+indexFirstOccurance);
        System.out.println("Last occurance is = "+indexLastOccurance);

        int ans = Math.fl
    }
}
