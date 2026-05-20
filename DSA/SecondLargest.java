public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 6, 1, 5, 4};
        int first = Integer.MIN_VALUE;
        int second = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
