public class MaxElementInArray{
    public static void main(String[] args){
        int arr[] = {4, 1, 3, 17, 2, 12};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}