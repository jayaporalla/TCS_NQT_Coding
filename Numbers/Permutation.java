package Numbers;

public class Permutation {
    public static void main(String[] args) {
        int n = 6, r = 4;
        System.out.println(factorial(n) / factorial(n - r));
    }
    private static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
