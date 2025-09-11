package Classes;

public class Five {
    public static void main(String[] args) {
        int r = 5;
        for(int i=0; i<r; i++){
            if (i%2 != 0) {
                System.out.print(" ");
            }
            for(int j=0; j<r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
