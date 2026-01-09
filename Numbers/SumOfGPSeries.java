package Numbers;

public class SumOfGPSeries {
    public static void main(String[] args) {
        double a = 1;
        double r = 0.5;
        int n = 3;
        System.out.println(sumOfGPSeries(a, r, n));
    }
    private static double sumOfGPSeries(double a, double r, int n){
        if(r == 1) return a * n;
        return a * (Math.pow(r, n) - 1) / (r - 1);
    }
}
