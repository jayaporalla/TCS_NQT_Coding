package Numbers;
public class PalindromeNumbers {
    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        palindromeNumbers(min, max);
    }
    public static void palindromeNumbers(int min, int max){
        for(int i = min; i <= max; i++){
            if(checkPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean checkPalindrome(int i){
        int reverse = 0;
        int num = i;
        while(i > 0){
            int digit = i % 10;
            reverse = (reverse * 10) + digit;
            i = i / 10;
        }
        return reverse == num;
    }
}
