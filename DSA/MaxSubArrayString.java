public class MaxSubArrayString {
    public static int maxSubString(String s){
        int n = s.length();
        int sl = 3;
        int sum = 0;
        int l = 0;
        int maxx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int asc = s.charAt(i);
            sum = sum + asc;
            if(i - l == sl){
                int asc2 = s.charAt(l);
                sum = sum - asc2;
                l++;
            }
            if(i + 1 - l == sl){
                maxx = Integer.max(maxx, sum);
            }
        }
        return maxx;
    }
    public static void main(String[] args){
        String s = "sravanth";
        System.out.println(MaxSubArrayString.maxSubString(s));
    }
}
