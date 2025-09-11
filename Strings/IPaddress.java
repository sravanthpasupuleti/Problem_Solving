package Strings;
public class IPaddress {
    public static void main(String[] args){
        String IPaddress = "2.10.500.0";
        String new_Address = " ";
        for(int i=0 ; i<IPaddress.length() ; i++){
            if (IPaddress.charAt(i) == '.') {
                new_Address = new_Address + "[.]";
            }
            else{
                new_Address = new_Address + IPaddress.charAt(i);
            }
        }
        System.out.println(new_Address);
    }
}