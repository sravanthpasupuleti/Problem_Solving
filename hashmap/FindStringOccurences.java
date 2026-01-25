import java.util.*;

public class FindStringOccurences{
    public static void main(String[] args){
        String[] names = {"hi", "hlo", "sravanth", "hi", "hlo", "hi"};

        //find how many times one word has occured in the array

        HashMap<String , Integer> hm= new HashMap<>();
        
        for(int i=0; i<names.length; i++){
            String n = names[i];
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n) + 1);
            }else{
                hm.put(n,1);
            }
        }

        System.out.println(hm);
    }
}