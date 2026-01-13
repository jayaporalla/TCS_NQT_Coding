package Arrays;
import java.util.*;

public class DuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        int[] result = duplicatesRemove(arr);
        System.out.println(Arrays.toString(result));
    }
    private static int[] duplicatesRemove(int[] array){
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : array){
            if(!map.containsKey(num)){
                map.put(num, true);
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
