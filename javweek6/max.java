import java.util.*;

class FindMax {
    public int MAX(int a, int b) {
        return (a > b) ? a : b;
    }

    public double MAX(double a, double b) {
        return (a > b) ? a : b;
    }

    public float MAX(float a, float b) {
        return (a > b) ? a : b;
    }
}

public class Gireesh {
    public static void main(String args[]) {
        FindMax f = new FindMax();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = f.MAX(a, b);
        System.out.printf("Maximum integer is %d%n", k);

        System.out.println("Enter two floats:");
        float Q = sc.nextFloat();
        float L = sc.nextFloat();
        float m = f.MAX(Q, L);
        System.out.printf("Maximum float is %f%n", m);

        System.out.println("Enter two doubles:");
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double g = f.MAX(r, x);
        System.out.printf("Maximum double is %f%n", g);

        sc.close();
    }
}
