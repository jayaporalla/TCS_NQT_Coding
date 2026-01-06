import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {2, 5, 6, 7, 1, 9};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int minIndex = i;
            int minValue = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > minValue){
                array[j + 1] = array[j];
                minIndex = j;
                j--;
            }
            array[minIndex] = minValue;
        }
        return array;
    }
}
