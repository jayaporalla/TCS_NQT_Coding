package Numbers;

public class CheckNumberStrong {
    public static void main(String[] args) {
        int N = 26;
        if(numberStrong(N)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean numberStrong(int N){
        int original = N;
        int sum = 0;
        while(N > 0){
            int digit = N % 10;
            sum += factorial(digit);
            N = N / 10;
        }
        return sum == original;
    }
    private static int factorial(int N){
        int result = 1;
        for(int i = 1; i <= N; i++){
            result = result * i;
        }
        return result;
    }
}
