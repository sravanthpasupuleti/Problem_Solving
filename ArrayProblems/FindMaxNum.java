public class FindMaxNum {
    public static void main(String[] args) {
        int[] nums = {3 , 7 , 2 , 9 , 1};
        int max = 0;
        int indx = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
                indx = i;
            }
        }
        System.out.println("Max num is : "+max);
        System.out.println("index num is : "+indx);
    }
}
