package Numbers;

public class AbundantNumber {
    public static void main(String[] args) {
        int n = 18;
        if(abundantNumber(n)){
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not Abundant Number");
        }
    }
    private static boolean abundantNumber(int N){
        int result = 1;
        for(int i = 2; i * i <= N; i++){
            if(N % i == 0){
                result += i;
                if(i != N / i){
                    result += N / i;
                }
            }
        }
        return result > N;
    }
}
