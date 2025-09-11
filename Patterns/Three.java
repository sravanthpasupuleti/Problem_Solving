package Classes;

public class Three {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if(i==0 || i==4 || j==0  || j==4){
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