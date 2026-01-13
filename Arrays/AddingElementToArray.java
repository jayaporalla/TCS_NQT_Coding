package Arrays;

import java.util.Arrays;

public class AddingElementToArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int arr[] = AddingElementToArray.insertBegin(array, 6);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] insertBegin(int[] array, int x){
        int[] arr = new int[array.length + 1];
        arr[0] = x;
        for(int i = 0; i < array.length; i++){
            arr[i + 1] = array[i];
        }
        return arr;
    }
}
