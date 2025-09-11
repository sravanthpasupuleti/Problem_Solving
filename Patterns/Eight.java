package Classes;

public class Eight {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = r - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print((k + 1) + " " );
            }
            for(int x = 2; x<=i + 1; x++){
                System.out.print( x +" ");
            }
            System.out.println();
        }
    }
}
