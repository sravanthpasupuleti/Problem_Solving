import java.util.*;;

public class Anagram {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        String s = "cbaebabacd";
        String p = "abc";

        int sLen = s.length();
        int pLen = p.length();
        int l = 0;

        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmp = new HashMap<>();

        for(int i=0; i<pLen; i++){
            char c = p.charAt(i);
            hmp.put(c, hmp.getOrDefault(c, 0) + 1);
        }

        for(int r=0; r<sLen; r++){

            char c = s.charAt(r);
            hms.put(c, hms.getOrDefault(c, 0) + 1);

            if (r - l == 3) {
                char ch = s.charAt(l);
                hms.put(ch, hms.get(ch) - 1);
                if (hms.get(ch) == 0) {
                    hms.remove(ch);
                }
                l++;
            }

            if (r + 1 - l == 3) {
                boolean fin = true;
                if (hms.size() != hmp.size()) {
                    fin = false;
                }else{
                    for(char key : hmp.keySet()){
                        if (!hms.containsKey(key)) {
                            fin = false;
                        }
                    }
                }
                
                if (fin) {
                    al.add(l);
                }
               
            }
        }
        System.out.println(al);
    }
}