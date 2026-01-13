package Arrays;
import java.util.*;

public class MedianOfArray {
    public static void main(String[] args) {
        int array[] = {2, 5, 1, 7};
        medianOfArray(array);
    }
    private static void medianOfArray(int[] array){
        Arrays.sort(array);
        double result = 0;
        int n = array.length;
        if(n % 2 == 0){
            int i1 = (n / 2) - 1;
            int i2 = (n / 2);
            result = (double) (array[i1] + array[i2]) / 2;
        } else {
            result = array[n / 2];
        }
        System.out.println(result);
    }
}
