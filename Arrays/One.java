package Arrays;
public class One{
    static int sum = 0;
    static int arr[] = {1 , 4 , 5 , 7, 1 , 1, 3 , 9};
    public static void main(String[] args) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                sum++;
            }
        }
        System.out.println("There are "+sum +" one's");
    }
}