package Arrays;

public class DuplicatesFromSorted {
    public static void main(String[] args) {
        int array[] = {1,1,2,2,2,3,3};
        duplicatesRemove(array);
    }
    private static void duplicatesRemove(int[] array){
        int n = array.length;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(array[j] != array[i]){
                i++;
                array[i] = array[j];
            }
        }
        for(int j = 0; j <= i; j++){
            System.out.print(array[j] + " ");
        }
    }
}
