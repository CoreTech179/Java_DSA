public class DigitSay {

    public static void sayDigit(int n, String [] array){

        if(n==0){
            return;
        }

        int indivisualDigit = n % 10;

        n = n / 10;

        sayDigit(n,array);

        System.out.println(array[indivisualDigit] +" ");

    }

    public static void main(String[] args) {
        
        String [] NumberArray  = new String[]{"Zero","One","two","Three","Four","Five","Six","Seven","Eight","Nine"};

        sayDigit(412,NumberArray);

    }
}
