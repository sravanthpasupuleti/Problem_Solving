import java.util.Scanner;

public class Fibonacci {

    static void fun(int n){
        int n1 = 0;
        int n2 = 1;
        for(int i=1; i<=n; i++){
            System.out.print(n1);
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci.fun(n);
        int num1 = 0;
        System.out.print(num1 + " ");
        int num2 = 1;
        while (num2 <= n) {
            System.out.print(num2 + " ");
            int temp = num2;
            num2 += num1;
            num1 = temp;
        }
    }
}
