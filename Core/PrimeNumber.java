import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int prime = scanner.nextInt();
        int count = 0;
        for(int i=1; i<=prime; i++){
            if(prime%i == 0){
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number");
        }else{
             System.out.println("NOt a prime number");
        }
    }
}
