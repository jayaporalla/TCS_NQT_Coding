package Numbers;

public class GCDOfNumbers {
    public static void main(String[] args) {
        int N1 = 9;
        int N2 = 12;
        System.out.println(gcdOfNumbers(N1, N2));
    }
    private static int gcdOfNumbers(int N1, int N2){
        while(N1 > 0 && N2 > 0){
            if(N1 > N2){
                N1 = N1 % N2;
            } else {
                N2 = N2 % N1;
            }
        }
        if(N1 == 0){
            return N2;
        }
        return N1;
    }
}
