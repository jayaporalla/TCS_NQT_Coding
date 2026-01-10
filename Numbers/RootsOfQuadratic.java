package Numbers;

public class RootsOfQuadratic {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        rootsOfQuadratic(a, b, c);
    }
    private static void rootsOfQuadratic(int a, int b, int c){
        int d = b * b - 4 * a * c;
        double root1 = 0, root2 = 0;
        double sqrt = Math.sqrt(Math.abs(d));
        if(d > 0){
            root1 = (- b + sqrt) / (2.0 * a);
            root2 = (- b - sqrt) / (2 * a);
            System.out.println("Roots are real and different, i.e (" + root1 + ", " + root2 + ").");
        } else if(d == 0){
            root1 = - b / 2.0 * a;
            System.out.println("Roots are real and same, i.e (" + root1 + ", " + root2 + ").");
        } else {
            root1 = (- b / (2.0 * a));
            root2 = (- b / (2.0 * a));
            System.out.println("Roots are complex, i.e (" + root1 +"+i" + sqrt + ", " + root2 + "-i" + sqrt + ").");
        }
    }
}
