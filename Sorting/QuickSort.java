package Sorting;
public class QuickSort {
    public static void main(String[] args) {
        int array[] = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(array, 0, array.length - 1);
        for(int n : array){
            System.out.print(n + " ");
        }
    }
    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = parition(array, low, high);
            quickSort(array, 0, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }
    public static int parition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
