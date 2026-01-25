import java.util.HashMap;

public class FindOccurences{
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 0, 1, 8, 1, 5, 1};

        HashMap<Integer,Integer> hm = new HashMap<>();
        // hm.put(3,6);
        // hm.put(4,8);
        // hm.put(5, 10);
        // hm.put(6, 12);

        // int n = 5;
        // if(hm.containsKey(n)){
        //     int prev = hm.get(n);
        //     hm.put(n, prev + 1);
        // }else{
        //     hm.put(n,1);
        // }

        
        for(int i=0; i<arr.length; i++){
            int ele = arr[i];                             //1,1  1,2  1,3 1,4
            if(hm.containsKey(ele)){                    //5,1   5,2 
                hm.put(ele, hm.get(ele) + 1);          //8,1   8,2
            }else{                                      //0,1
                hm.put(ele , 1);                 
            }
        }

        System.out.println(hm);
    }
}
