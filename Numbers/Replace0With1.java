package Numbers;

public class Replace0With1 {
    public static void main(String[] args) {
        int n = 204;
        System.out.println(replaceNum(n));
    }
    private static int replaceNum(int n){
        int result = 0;
        int N = n;
        int sum = 0;
        while(N > 0){
            int digit = N % 10;
            if(digit == 0){
                result = (result * 10) + 1;
            } else {
                result = (result * 10) + digit;
            }
            N = N / 10;
        }
        while(result > 0){
            int digit = result % 10;
            sum = (sum * 10) + digit;
            result = result / 10;
        }
        return sum;
    }
}
