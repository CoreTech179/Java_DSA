public class ArraySum {

    public static int arraySum(int [] array,int sum,int i){

        if(array.length==0){
            return sum = 0;
        }
        if(array.length==1){
            return sum = array[1];
        }
        if(i==array.length){
            return sum;
        }

        arraySum(array, sum+=array[i], i++);

    }

    public static void main(String[] args) {
        
        int sum = 0;
        int i = 0;
        int [] array = new int[]{1,2,3,4,5};

        int result = arraySum(array,sum,i);
        System.out.println("Sum of the Array is = "+result);

    }
}
