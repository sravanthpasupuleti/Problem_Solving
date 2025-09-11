package Arrays;
import static Arrays.One.arr;
import static Arrays.One.sum;
public class Two {
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                sum++;
            }
        }
        System.out.println("There are " + sum +" numbers divisible by three");
    }
}
