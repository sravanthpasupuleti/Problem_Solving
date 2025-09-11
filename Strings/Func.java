package Strings;
public class Func {
    public static int[] arr(){
        System.out.println("array method");
        int ar[] = {2 , 7, 6, 8, 3};
        return ar;
    }
    public static void main(String[] args) {
        int Final[] = arr();
        for(int i=0 ; i<Final.length ; i++){
           System.out.println(Final[i]);
        }
    }
}