package Numbers;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int N = 25;
        if(automorphicNumber(N)){
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
    private static boolean automorphicNumber(int N){
        int square = N * N;
        String numStr = String.valueOf(N);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
}
