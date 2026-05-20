public class ReverseString {
    public static void main(String[] args) {
        String s = "hiih";
        String reverse = "";
        for(int i=s.length() - 1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(s==reverse);  //false , becuase == operator checks addresses not the actual string
        System.out.println(s.equals(reverse)); //true. here it checks the actual string
        // System.out.println(s.equals(reverse));
    }
}
