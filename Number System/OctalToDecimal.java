public class OctalToDecimal {
    public static void main(String[] args) {
        int n = 345;
        System.out.println(octalToDecimal(n));
    }
    public static int octalToDecimal(int n){
        int result = 0;
        int index = 0;
        while(n != 0){
            int digit = n % 10;
            result += digit * Math.pow(8, index);
            index++;
            n = n / 10;
        }
        return result;
    }
}
