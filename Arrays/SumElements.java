package Arrays;
import java.util.*;

public class SumElements {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(sumOfElements(array));
    }
    public static int sumOfElements(int[] array){
        // int sum = 0;
        // for(int i = 0; i < array.length; i++){
        //     sum += array[i];
        // }
        // return sum;
        return Arrays.stream(array).sum(); // built-in method in stream
    }
}
