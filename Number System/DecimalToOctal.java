public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(decimalToOctal(n));
    }
    public static String decimalToOctal(int n){
        StringBuilder sb = new StringBuilder();
        if(n == 0){
            return "0";
        }
        while(n > 0){
            int rem = n % 8;
            sb.insert(0, rem);
            n = n / 8;
        }
        return sb.toString();
    }
}
