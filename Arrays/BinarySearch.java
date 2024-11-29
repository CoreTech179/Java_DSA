public class BinarySearch {

    public static int binarySearch(int [] array, int key){

        int start = 0;
        int end = (array.length-1);

        int mid = (start + end)/2;

        while(start <= end){
            // condition ye he ki array ka starting position or ending position less or barabar equal hona parega hamesha, eesa na ho ki start agee nikal jai oor end peeche re jaye tab bhaiya galat he.

            if(array[mid]==key){

                // agar key match kar jai mid position se to index return kar do
                return mid;

            }else if(key > array[mid]){

                // agar mera key greater he mid se to array ke right side se search karna parega. isliye end to apne position me sahi he bas mera new start ab mid + 1 hoga
                start = mid + 1;

            }else{

                // agar mera key less than he mid se to array ke left side se search karna parega. isliye start to apne position me sahi he bas mera new end ab mid - 1 hoga
                end = mid - 1;

            }

            mid = (start + end)/2;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        // Binary Search --> Basically this algorithm only works on on the array that have either increasing values or decresing values 

        int [] even = {2,4,6,8,12,18};


        int indexEven = binarySearch(even, 8);
        System.out.println("Index is = "+indexEven);

    }
}
