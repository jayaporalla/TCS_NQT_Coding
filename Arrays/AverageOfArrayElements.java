package Arrays;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int array[] = {1,2,1,1,5,1};
        System.out.println(averageOfArray(array));
    }
    private static double averageOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
