public class VariableSizeSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 1, 2,1, 9};
        int n = arr.length;
        int k = 10;
        int l = 0;
        int sum = 0;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            while(sum > k){
                sum -= arr[l];
                l++;
            }
            int size = i + 1 - l;
            res = Math.max(res, size);
        }
        System.out.println(res);
    }
}