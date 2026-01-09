package Numbers;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        double a = 1.123;
        double b = 1.124;
        double c = 1.125;
        if(a > b && a > c){
            System.out.println(a);
        } else if(b > a && b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
