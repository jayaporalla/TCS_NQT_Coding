import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
    public static int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            boolean swap = false;
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        return array;
    }
}
