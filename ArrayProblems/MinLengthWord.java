public class MinLengthWord {
    public static String findminString(String[] s){
        String minword;
        int firstlen = s[0].length();
        for (int i = 1; i < s.length; i++) { 
            if (s[i].length() < firstlen) {
                firstlen = s[i].length();
            }
        }
        minword = s[firstlen];
        return minword;
    }
    public static void main(String[] args) {
        String[] s = {"hlo" , "pokiri" , "hi" , "varanasi"};
        System.out.println(MinLengthWord.findminString(s));
    }
}
