import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter range : ");
        int range = sc.nextInt();
        int i=0,j=1;
        int sum = 0;
        do{
            System.out.print(sum + " ");
            sum = i + j;
            i = j;
            j = sum;
        }while(sum<=range);
    }
}
