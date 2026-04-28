public class TwoAtmostOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 1, 1, 6, 7, 1, 0, 1, 1};
        int n = arr.length;
        int l = 0;
        int count = 0;
        int res = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
            }
            while(count == 3) {
                if (arr[l] == 1) {
                    count--;
                }
                l++;
            }
            int sum = i + 1 - l;
            res = Math.max(res, sum);
        }
        System.out.println(res);
    }
}
