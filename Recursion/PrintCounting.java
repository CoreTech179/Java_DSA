public class PrintCounting {
    public static void Count(int n){
        if(n==1){
            System.out.println(1);
            return;
        }

        Count(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Count(5);
    }
}
