//print the string with given no.of times
package Strings;
public class Times{
    public  void func(String s , int n){
        // System.out.println("Sravanth");
        for (int i = 1; i <= n; i++) {
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        // String Name = "Hloo";
        // int number = 4;
        // for(int i=1; i<=number; i++){
        //     System.out.println(Name);
        // }
        Times obj = new Times();
        obj.func("srav" , 4);
        obj.func("Royall" , 2);
    }
}