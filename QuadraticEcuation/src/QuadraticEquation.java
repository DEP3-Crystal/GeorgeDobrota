public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double common = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b + common) / (2 * a);
        double root2 = (-b - common) / (2 * a);
        return new Roots(root1, root2);
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}
