public class SecondLargest{
    public static void main(String[] args){
        int[] input= {12, 35, 1, 10, 37, 1};
        int max = input[0];
        int[] maxar = new int[input.length];
        for(int i=1 ; i<input.length ; i++){
            if(max < input[i]){
                max = input[i];
                System.out.print(max + " ");
                maxar[i - 1] = input[i];
            }else{
                max = max;
            }
        }
        System.out.println(max);
        System.out.println(maxar[1]);
    }
}