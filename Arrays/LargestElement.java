package Arrays;
public class LargestElement {
    public static void main(String[] args) {
        int[] array = {21, 10, 15, 6, 4, 12};
        System.out.println(largestElement(array));
    }
    private static int largestElement(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
