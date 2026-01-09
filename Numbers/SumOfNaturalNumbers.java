package Numbers;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(sumOfNaturalNumbers(N));
    }
    private static int sumOfNaturalNumbers(int N){
        return (N * (N + 1)) / 2;
    }
}
