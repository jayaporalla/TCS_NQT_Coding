import java.util.*;

public class IncreasingDecreasingOrder {
    public static void main(String[] args) {
        int[] array = {8, 7, 1, 6, 5, 9};
        orderIncreasingDecreasing(array);
        for(int n : array){
            System.out.print(n + " ");
        }
    }
    public static void orderIncreasingDecreasing(int[] array){
        Arrays.sort(array);
        int n = array.length;
        for(int i = n / 2, j = n - 1; i < j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
