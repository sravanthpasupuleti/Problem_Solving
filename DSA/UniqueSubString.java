import java.util.HashMap;

public class UniqueSubString {
    public static void main(String[] args) {
    String s = "tmmzuxt";
    int n = s.length();
    int l = 0;
    int count = 0;
        int res = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if(hm.get(c) > 1){
                count++;
            }
            while(count > 0){
                if(s.charAt(l) == c){
                    hm.put(c, hm.get(c) - 1);
                    count--;
                }else{
                    hm.remove(s.charAt(l));
                }
                l++;
                
            }
            res = Math.max(res, i + 1 - l);
        }
        System.out.println(res);
    }
    
}