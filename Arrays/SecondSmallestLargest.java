package Arrays;
public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] array = {21, 10, 15, 6, 4, 12, 2};
        System.out.println(secondSmallestElement(array));
        System.out.println(secondLargestElement(array));
    }
    private static int secondSmallestElement(int[] array){
        if(array.length < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < small){
                secondSmall = small;
                small = array[i];
            } else if(array[i] < secondSmall && array[i] != small){
                secondSmall = array[i];
            }
        }
        return secondSmall;
    }
    private static int secondLargestElement(int[] array){
        if(array.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            } else if(array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
}
