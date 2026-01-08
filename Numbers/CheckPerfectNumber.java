package Numbers;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        int N = 6;
        if(checkPerfectNumber(N)){
            System.out.print(N + " is a perfect number");
        } else {
            System.out.print(N + " is not a perfect number");
        }
    }
    private static boolean checkPerfectNumber(int N){
        if(N <= 1) return false;
        int sum = 1;
        for(int i = 2; i * i <= N; i++){ // Time complexity sqrt of N optimized way
            if(N % i == 0){
                sum += i;
                if(i != N / i){
                    sum += N / i;
                }
            }
        }
        return sum == N;
    }
}
