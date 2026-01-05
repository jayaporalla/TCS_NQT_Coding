public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {21, 10, 15, 6, 4, 12, 2};
        reverseArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    private static void reverseArray(int[] array){
        int left = 0, right = array.length - 1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
