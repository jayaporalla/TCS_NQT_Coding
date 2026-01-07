public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(binaryToDecimal(s));
    }
    public static int binaryToDecimal(String s){
        int result = 0;
        int base = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1'){
                result += base;
            }
            base *= 2;
        }
        return result;
        // return Integer.parseInt(s, 2); // direct built-in method.
    }
}
