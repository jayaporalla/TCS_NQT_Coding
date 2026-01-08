package Numbers;
import java.util.*;

public class CheckPrimeRange {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        List<Integer> list = new ArrayList<>();
        for(int i = a; i <= b; i++){
            if(checkPrime(i)){
                list.add(i);
            }
        }
        System.out.print(list);
    }
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
