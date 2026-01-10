package Numbers;

public class AddingTwoFractions {
    public static void main(String[] args) {
        int Numerator1 = 5, Denominator1 = 2, Numerator2 = 1, Denominator2 = 2;
        addingTwoFractions(Numerator1, Denominator1, Numerator2, Denominator2);
    }
    private static void addingTwoFractions(int Numerator1, int Denominator1, int Numerator2, int Denominator2){
        int lcm = Denominator1 * Denominator2 / gcd(Denominator1, Denominator2);
        int Num1 = Numerator1 * (lcm / Denominator1);
        int Num2 = Numerator2 * (lcm / Denominator2);
        int resultNum = Num1 + Num2;
        int resultDen = lcm;
        int common = gcd(resultNum, resultDen);
        resultNum /= common;
        resultDen /= common;
        System.out.println("Numerator = " + resultNum + " , Denominator = " + resultDen);
    }
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
