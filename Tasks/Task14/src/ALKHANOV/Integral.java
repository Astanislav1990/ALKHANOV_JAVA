package ALKHANOV;

import java.util.Scanner;

/**
 * Created by Админ on 07.02.2019.
 */


public class Integral {
    public static double f(double x) {
        return x * x;
    }

    public static double ByLeftRectangle(double a, double b, int n) {
        double s = 0;
        double d = (b - a) / n;
        for (int i = 0; i < n; i++) {
            double x = a + i * d;
            s += d * f(x);
        }
        return s;
    }

    public static double BySimpson(double a, double b, int n) {
        double si = 0;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double s4 = 0;
        double d = (b - a) / (2 * n);
        int i;
        for (i = 0; i <= 2 * n; i++) {
            double x = a + i * d;
            if (i == 1) {
                s1 = 4 * f(x);
            }
            if (i == 3) {
                s1 += 4 * f(x);
            }
            if (i == 5) {
                s1 += 4 * f(x);
            }
            if (i == 7) {
                s1 += 4 * f(x);
            }
            if (i == 9) {
                s1 += 4 * f(x);
            }
            if (i == 0) {
                s2 = f(x);
            }
            if (i == 2) {
                s3 = 2 * f(x);
            }
            if (i == 4) {
                s3 += 2 * f(x);
            }
            if (i == 6) {
                s3 += 2 * f(x);
            }
            if (i == 8) {
                s3 += 2 * f(x);
            }
            if (i == 10) {
                s4 = f(x);
            }
            si = d / 3 * (s2 + s1 + s3 + s4);
        }
        return si;
    }
    public static double ByTrapezium(double a, double b,  int n) {
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double si = 0;
        double d = (b - a)/n;
        for (int i = 0; i <= n; i++){
            double x = a + i * d;
            if (i == 0) {
                s1 = f(x);
            }
            if (i == 1) {
                s2 = 2 * f(x);
            }
            if (i == 2) {
                s2 += 2 * f(x);
            }
            if (i == 3) {
                s2 += 2 * f(x);
            }
            if (i == 4) {
                s2 += 2 * f(x);
            }
            if (i == 5) {
                s3 = f(x);
            }

            si = d/2*( s1 + s2 + s3 );
        }
        return si;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println("Интеграл равен" + " = " + ByLeftRectangle(a, b, n));
        System.out.println("Интеграл равен" + " = " + BySimpson(a, b, n));
        System.out.println("Интеграл равен" + " = " + ByTrapezium(a, b, n));
    }
}
