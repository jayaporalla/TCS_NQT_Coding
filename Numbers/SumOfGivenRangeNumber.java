package Numbers;

public class SumOfGivenRangeNumber {
    public static void main(String[] args) {
        int l = 5, r = 9;
        System.out.println(sumOfGivenRange(l, r));
    }
    private static int sumOfGivenRange(int l, int r){
        return (r * (r + 1)) / 2 - ((l - 1) * l) / 2;
    }
}
