package Numbers;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(sumOfNumber(n));
    }
    private static int sumOfNumber(int n){
        if(n == 0) return 0;
        return 1 + (n - 1) % 9;
    }
}
