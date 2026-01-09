package Numbers;

public class MaximumMinimumDigit {
    public static void main(String[] args) {
        int N = 2746;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(N > 0){
            int digit = N % 10;
            max = Math.max(max, digit);
            min = Math.min(min, digit);
            N = N / 10;
        }
        System.out.println("Largest Digit: " + max + " , Smallest Digit: " + min);
    }
}
