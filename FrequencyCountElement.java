import java.util.HashMap;
import java.util.Map;

class FrequencyCountElement{
    public static void main(String[] args) {
        int[] array = {10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}