package Numbers;

public class ReverseDigit {
    public static void main(String[] args) {
        int N = 12348975;
        System.out.println(reverseDigit(N));
    }
    private static int reverseDigit(int N){
        int result = 0;
        while(N > 0){
            int digit = N % 10;
            result = result * 10 + digit;
            N = N / 10;
        }
        return result;
    }
}
