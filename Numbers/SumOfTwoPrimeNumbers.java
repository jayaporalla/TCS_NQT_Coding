package Numbers;

public class SumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(sumOfPrime(n) ? "True" : "False");
    }
    private static boolean sumOfPrime(int n){
       for(int i = 2; i <= n / 2; i++){
            if(isPrime(i) && isPrime(n - i)){
                return true;
            }
       }
       return false;
    }
    private static boolean isPrime(int n){
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
