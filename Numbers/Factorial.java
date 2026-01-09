package Numbers;

public class Factorial {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(fatcorial(N));
    }
    private static int fatcorial(int N){
        int result = 1;
        for(int i = 1; i <= N; i++){
            result *= i;
        }
        return result;
    }
}
