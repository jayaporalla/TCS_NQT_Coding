package Numbers;

public class HarshadNumber {
    public static void main(String[] args) {
        int n = 378;
        if(harshadNumber(n)){
            System.out.println("Yes, it is a Harshad Number");
        } else {
            System.out.println("No, it is not a Harshad Number");
        }
    }
    private static boolean harshadNumber(int N){
        int n = N;
        int result = 0;
        while(n > 0){
            int digit = n % 10;
            result += digit;
            n = n / 10;
        }
        return N % result == 0;
    }
}
