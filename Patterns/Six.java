package Classes;

public class Six {
    public static void main(String[] args) {
        int r=6;
        for(int i=r - 1; i>=0; i--){
            for(int k=r - 1; k>i; k--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2  ; j++) {
                if (i == r-1 || j == 0 || j == i*2) {
                    System.out.print("*");        
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}