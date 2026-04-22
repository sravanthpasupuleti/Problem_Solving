public class MaxSubArray {
    public static int maxSubArray(int[] arr){
        int n = arr.length;
        int sl = 3;
        int sum = 0;
        int l = 0;
        int maxx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            if(i - l == sl){
                sum = sum - arr[l];
                l++;
            }
            if(i + 1 - l == sl){
                maxx = Integer.max(maxx, sum);
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
        int[] arr = {5,9,1,8,7};
        int result = MaxSubArray.maxSubArray(arr);
        System.out.println(result);
    }
}
