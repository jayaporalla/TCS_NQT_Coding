package Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println(Arrays.toString(mergerSort(array)));
    }
    public static int[] mergerSort(int[] array){
        int step = 1;
        int length = array.length;
        while(step < length){
            for(int i = 0; i < length; i += 2 * step){
                int mid = Math.min(i + step, length);
                int end = Math.min(i + 2 * step, length);
                int left[] = Arrays.copyOfRange(array, i, mid);
                int right[] = Arrays.copyOfRange(array, mid, end);
                int merged[] = merge(left, right);
                System.arraycopy(merged, 0, array, i, merged.length);
            }
            step *= 2;
        }
        return array;
    }
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while(i < left.length){
            result[k++] = left[i++];
        }
        while(j < right.length){
            result[k++] = right[j++];
        }
        return result;
    }
}
