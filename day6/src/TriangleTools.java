public class TriangleTools {
    public static boolean isTriangle(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b;
    }

    public static boolean isIsoscelesTriangle(double a, double b, double c){
        return isTriangle(a, b, c) && (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
    }

    public static boolean isEquilateralTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && a == b && b == c;
    }

    public static double area(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double perimeter(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return 0;
        }
        return a + b + c;
    }
}

