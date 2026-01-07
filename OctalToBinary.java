public class OctalToBinary {
    public static void main(String[] args) {
        int n = 345;
        System.out.println(decimalToBinary(n));
    }
    public static int octalToDecimal(int n){
        int result = 0;
        int i = 0;
        while(n != 0){
            int digit = n % 10;
            result += digit * Math.pow(8, i);
            i++;
            n = n / 10;
        }
        return result;
    }
    public static int decimalToBinary(int n){
        int s = octalToDecimal(n);
        int result = 0;
        int base = 0;
        while(s > 0){
            int digit = s % 2;
            result += digit * Math.pow(10, base);
            base++;
            s = s / 2;
        }
        
        return result;
    }
}
