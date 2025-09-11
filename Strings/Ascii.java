package Strings;
public class Ascii{
    public static void main(String[] args){
        String name = "hello";
        int finall = 0;
        for(int i=0; i<name.length()-1; i++){
           finall = finall + Math.abs(name.charAt(i) - name.charAt(i+1));
        }
        System.out.println(finall);
    }
}