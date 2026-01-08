package Numbers;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int N = 5;
        if(checkEvenOdd(N) == 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
    private static int checkEvenOdd(int N){
        return N & 1; // bitwise operations do fast rather than other operations.
    }
}
