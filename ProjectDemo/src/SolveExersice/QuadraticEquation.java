package SolveExersice;

import java.util.Scanner;

public class QuadraticEquation {
    public static void giaiPTBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT Vo so nghiem");
            } else {
                System.out.println("PT Vo nghiem");
            }
        } else {
            System.out.println("PT co nghiem duy nhat x = " + (-b / a));
        }
    }

    public static void giaiPTBacHai(double a, double b, double c) {
        if (a == 0) {
            giaiPTBacNhat(b, c);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("PT co nghiem kep x1 = x2 = " + x);
            } else {
                if (delta < 0) {
                    System.out.println("PT Vo nghiem");
                } else {
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("PT co hai nghiem phan biet");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        giaiPTBacHai(a, b, c);
    }
}


