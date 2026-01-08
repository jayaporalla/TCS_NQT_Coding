package Numbers;

public class CheckPositiveNegativeNumber {
    public static void main(String[] args) {
        int N = -10000;
        if(checkPositiveNegativeNumber(N)){
            System.out.print("Positive");
        } else {
            System.out.print("Negative");
        }
    }
    private static boolean checkPositiveNegativeNumber(int N){
        return N >> 31 == 0;
    }
}
