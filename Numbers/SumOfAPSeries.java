package Numbers;

public class SumOfAPSeries {
    public static void main(String[] args) {
        int n = 8;
        int a = 2;
        int d = 5;
        System.out.println(sumOfAPSeries(n, a, d));
    }
    private static int sumOfAPSeries(int n, int a, int d){
        int result = n / 2 * (2*a + (n - 1) * d);
        return result;
    }
}
