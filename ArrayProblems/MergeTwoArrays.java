public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] s1 = {"hi" , "pokiri" , "varanasi"};
        String[] s2 = {"hlo" , "salaar" , "spirit"};
        System.out.print("{");
        for(int i=0; i<s1.length; i++){
            System.out.print(s1[i]+","+s2[i]);
            if (i!=2) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}