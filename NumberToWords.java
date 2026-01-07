public class NumberToWords {
    public static void main(String[] args) {
        String n = "370";
        numberToWords(n);
    }
    public static void numberToWords(String n){
        String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigit = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tenMultiple = {"", "", "twnety", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] tensPower = {"hundered", "thousand"};
        if(n.length() == 0){
            return;
        } else if(n.length() == 1){
            System.out.print(singleDigit[n.charAt(0) - '0']);
            return;
        }
        int len = n.length();
        for(int i = 0; i < n.length(); i++){
            if(len > 2){
                if(n.charAt(i) != 0){
                    System.out.print(singleDigit[n.charAt(i) - '0'] + " ");
                    System.out.print(tensPower[len - 3] + " ");
                }
                len--;
            } else {
                if((n.charAt(i) - '0') == 1){
                    System.out.print(twoDigit[n.charAt(i + 1) - '0'] + " ");
                    return;
                } else if((n.charAt(i) - '0') != 0){
                    System.out.print(tenMultiple[n.charAt(i) - '0'] + " ");
                    if((n.charAt(i + 1) - '0') != 0){
                        System.out.print(singleDigit[n.charAt(i + 1) - '0'] + " ");
                        return;
                    }
                }
            }
        }
    }
}
