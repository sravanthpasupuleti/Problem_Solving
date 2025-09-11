package Classes;

public class Seven {
    public static void main(String[] args){
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = r-1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<=i*2 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
