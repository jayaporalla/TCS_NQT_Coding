package Numbers;

public class LeapYear {
    public static void main(String[] args) {
        int N = 2000;
        if(leapYear(N)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean leapYear(int N){
        return (N % 400 == 0) || (N % 4 == 0 && N % 100 != 0);
    }
}
