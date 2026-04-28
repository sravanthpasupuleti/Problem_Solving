public class AtmostOddNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 1, 3, 1, 1, 6, 7, 1, 8, 1};
        int n = arr.length;
        int l = 0;
        int k = 2;
        int count = 0;
        int res = 0;
        for(int i=0; i<n; i++){
            if (arr[i]%2 != 0) {
                count++;
            }
            while(count > k){
                if(arr[l]%2 != 0){
                    count--;
                }
                l++;
            }
            res = Math.max(res, i + 1 - l);
        }
        System.out.println(res);
    }
}
