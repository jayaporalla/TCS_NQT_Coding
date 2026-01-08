public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 17;
        int result = 0;
        int base = 1;
        while(n > 0){
            int digit = n % 2;
            result = result + digit * base;
            base = base * 10;
            n = n / 2;
        }
        System.out.println(result);
    }
}
