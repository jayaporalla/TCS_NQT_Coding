package Numbers;

import java.util.*;

public class PrimeFactorsOfNumber {
    public static void main(String[] args) {
        int N = 60;
        List<Integer> list = getPrimeFactors(N);
        for(int i : list){
            System.out.print(i + " ");
        }
    }
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        if (n % 2 == 0) {
            primeFactors.add(2);
            while (n % 2 == 0)
                n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n > 1)
            primeFactors.add(n);

        return primeFactors;
    }
}
