package Strings;
public class Palindrome2 {
    public static void main(String[] args){
        String Name = "hlosh";
        boolean palindrome = true;
        for(int i=0; i<Name.length()/2; i++){
            if (Name.charAt(i) != Name.charAt(Name.length() - i - 1)) {
                palindrome = false;
            }
            else{
                palindrome = true;
            }
        }
        if (palindrome == true) {
            System.err.println(Name +" is a palindrome");
        }
        else{
            System.out.println(Name + " is not a palindrome");
        }
    }
}
