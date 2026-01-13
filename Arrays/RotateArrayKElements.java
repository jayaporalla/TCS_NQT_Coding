package Arrays;

public class RotateArrayKElements {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Right Rotation");
        rightRotate(array, k);
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println("");
        array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Left Rotation");
        leftRotate(array, k);
        for(int num : array){
            System.out.print(num + " ");
        }
    }
    private static void swapElements(int[] array, int left, int right){
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    private static void leftRotate(int[] array, int d){
        int n = array.length;
        d = d % n;
        if(d == 0) return;
        swapElements(array, 0, d - 1);
        swapElements(array, d, n - 1);
        swapElements(array, 0, n - 1);
    }
    private static void rightRotate(int[] array, int d){
        int n = array.length;
        leftRotate(array, n - (d % n));
    }
}
