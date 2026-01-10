package Numbers;

public class LCMOfNumbers {
    public static void main(String[] args) {
        int n = 3;
        int m = 6;
        System.out.println(lcmOfNumbers(n, m));
    }
    private static int lcmOfNumbers(int n, int m){
        int gcd = gcdOfNumbers(n, m);
        return (n * m) / gcd;
    }
    private static int gcdOfNumbers(int n, int m){
        if(m == 0) return n;
        return gcdOfNumbers(m, n % m);
    }
}
