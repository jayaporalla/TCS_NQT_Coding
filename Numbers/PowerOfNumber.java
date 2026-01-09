package Numbers;

public class PowerOfNumber {
    public static void main(String[] args) {
        long x = 21;
        long n = 2;
        System.out.println(powerOfNumber(x, n));
    }
    private static long powerOfNumber(long x, long n){
        long result = 1;
        while(n > 0){
            if(n % 2 == 1){
                result = result * x;
            }
            x = x * x;
            n = n / 2;
        }
        return result;
    }
}
