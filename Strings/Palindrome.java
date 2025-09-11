package  Strings;
public class Palindrome{
    public static void main(String[] args){
        String Name = "olo";
        String Rev_name = "";
        for(int i=Name.length()-1 ; i>=0 ; i--){
            System.out.println(Name.charAt(i));
            Rev_name = Rev_name + Name.charAt(i);
        }
        if(Name.equals(Rev_name)){
            System.out.println(Name + " is a palindrome");
        }
        else{
            System.out.println(Name + " is not a palindrome");
        }
    }
}