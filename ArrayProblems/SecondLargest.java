

import java.util.Arrays;

public class SecondLargest{
    public static void main(String[] args){
        int[] input= {12, 35, 1, 10, 37, 7};
        Arrays.sort(input);
        for (int i : input) {
            System.out.println(i);            
        }
        















































        // // int max = input[0];
        // int[] maxar = new int[input.length];
        // // for(int i=1 ; i<input.length ; i++){
        // //     if(max < input[i]){
        // //         max = input[i];
        // //         System.out.print(max + " ");
        // //         maxar[i - 1] = input[i];
        // //         maxar[i + 1] = input[i];
        // //     }else{
        // //         max = max;
        // //     }
        // // }
        // // System.out.println(max);
        // // System.out.println(maxar[1]);
        // for (int i=0; i<input.length; i++) {
        //     if (input[i] < input[i+1]) {
                
        //     }else{
        //         maxar[i] = input[i+1];
        //         maxar[i+1] = input[i];
        //     }
        // }
    }
}