public class Fibonacci {
    public static void main(String[] args) {
        int A=0;
        int B=1;
        int fibonacci=0;
        System.out.print(A + " " + B + " ");
        while (true) { 
            fibonacci = A + B;
            if (fibonacci >= 20) {
                break;
            }else{
            System.out.print(fibonacci + " ");
            A = B;
            B = fibonacci;
            }
        }
    }
}
