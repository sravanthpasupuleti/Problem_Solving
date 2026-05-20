import java.util.Scanner;

public class PalindromeString {
    static boolean fun(String s){
        StringBuilder rev = new StringBuilder();
        for(int i= s.length()-1; i>=0; i--){
            rev.append(s.charAt(i));
        }
        return s.equals(rev.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean bool = PalindromeString.fun(s);
        System.out.println(bool);
        // String revString = "";
        // for(int i = s.length() - 1; i>=0; i--){
        //     revString += s.charAt(i);
        // }
        // System.out.println(s);
        // System.out.println(revString);
        // System.out.println(s.equals(revString));
    }
}
