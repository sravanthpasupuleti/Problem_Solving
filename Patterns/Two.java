package Classes;

public class Two {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 6;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if (j == columns-1) {
                    System.out.print(" *");
                }
                else{
                    System.out.print(" *-");
                }
            }
            System.out.println();
        }
    }
}
