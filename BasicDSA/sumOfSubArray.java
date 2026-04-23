public class sumOfSubArray {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1, 4 , 3};
        int n = arr.length;
        int sl = 3;
        int l = 0;
        int threshold = 7;
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(i - l == sl){
                sum -= arr[l];
                l++;
            }
            
            if(i + 1 - l == sl){
                if(sum >= threshold){
                    count++;
                }
                // sum -= arr[l];
                // l++;
            }
        }
        System.out.println("number of sum of subArrays of greater than threshold is "+count);
    }
}
