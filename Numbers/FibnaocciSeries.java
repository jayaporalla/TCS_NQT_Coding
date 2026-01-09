package Numbers;

import java.math.BigInteger;

public class FibnaocciSeries {
    public static void main(String[] args) {
        int N = 6;
        fibnaociiSeries(N);
    }
    private static void fibnaociiSeries(int N){
        if(N == 0){
            System.out.println(0);
        } else if(N == 1) {
            System.out.println(1);
        } else {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            for(int i = 2; i <= N; i++){
                BigInteger c = a.add(b);
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}
