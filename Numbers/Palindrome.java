package Numbers;
class Palindrome{
    public static void main(String[] args) {
        String S = "7789";
        if(palindrome(S)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean palindrome(String S){
        int left = 0;
        int right = S.length() - 1;
        while(left < right){
            if(S.charAt(left) != S.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}