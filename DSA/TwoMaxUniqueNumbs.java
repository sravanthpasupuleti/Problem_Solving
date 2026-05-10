import java.util.HashSet;

public class TwoMaxUniqueNumbs {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int n = fruits.length;
        int l = 0;
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<n; i++){

            hs.add(fruits[i]);

            while(hs.size() > 2){
                hs.remove(fruits[l]);
                l++;
            }
            
            res = Math.max(res, i + 1 - l);
        }

        // return res;
        System.out.println(res);
    }
}
