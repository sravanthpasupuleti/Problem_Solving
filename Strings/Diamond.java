package Strings;
public class Diamond {
    public static void main(String[] args){
        int count=0;
        String diamond = "aB";
        String stones = "acBbB";
        for(int i=0; i<diamond.length(); i++){
            for(int j=0; j<stones.length(); j++) {
                if (diamond.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        System.err.println(count);
    }
}
