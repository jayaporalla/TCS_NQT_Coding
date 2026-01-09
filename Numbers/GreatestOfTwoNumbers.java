package Numbers;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        double a = 1.123;
        double b = 1.124;
        
        if(a > b){
            System.out.println(a); // or else can use built-in Math.max();
        } else {
            System.out.println(b);
        }
    }
}
