public class ReverseEachWord{
    static String reversed = "";
    static String method(String name){

        int length = name.length() - 1;
       
        for(int i=0; i<=length; i++){
            if(name.charAt(i) == ' ' || i == length){
                for(int j = i; j>=0; j--){
                    if(name.charAt(j) == ' '){
                        continue;
                    }else{
                        reversed = reversed + name.charAt(j);
                    }
                }
                reversed = reversed + " ";
            }
           
        }

        return reversed;
    }
    public static void main(String[] args){
        System.out.println(ReverseEachWord.method("Hlo java Fine"));
    }

}