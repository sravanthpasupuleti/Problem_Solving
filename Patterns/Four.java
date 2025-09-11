package Classes;

public class Four{
    public static void main(String[] args){
        int r = 5;
        for(int i = 0; i<r; i++){
            for(int k=r; k>i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}