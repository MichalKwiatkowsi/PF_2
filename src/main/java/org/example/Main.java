import java.lang.Math;

public class Main {
    public static double cubeRoot(double x) {
        return Math.pow(x, 1.0/3.0);
    }

    public static double heronEpsilon(double x, double epsilon) {
        double a = x;
        while (true) {
            double b = (a + x/a) / 2.0;
            if (Math.abs(a - b) < epsilon) {
                return b;
            }
            a = b;
        }
    }

    public static double heronSteps(double x, int n) {
        double a = x;
        for (int i = 0; i < n; i++) {
            double b = (a + x/a) / 2.0;
            a = b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(heronEpsilon(2, 0.001));
        System.out.println(heronSteps(2, 5));
        System.out.println(cubeRoot(27));
    }
}

