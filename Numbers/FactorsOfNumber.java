package Numbers;

import java.util.*;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int N = 9;
        fatcorsOfNumber(N);
    }
    private static void fatcorsOfNumber(int N){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= N; i++){
            if(N % i == 0){
                list.add(i);
                if(i != N / i){
                    list.add(N / i);
                }
            }
        }
        System.out.println(list);
    }
}
