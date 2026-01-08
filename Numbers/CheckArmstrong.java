package Numbers;
public class CheckArmstrong {
    public static void main(String[] args) {
        int N = 301;
        if(checkArmstrong(N)){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
    private static boolean checkArmstrong(int N){
        int k = String.valueOf(N).length();
        int result = 0;
        int n = N;
        while(n > 0){
            int digit = n % 10;
            result += Math.pow(digit, k);
            n= n / 10;
        }
        return result == N;
    }
}
