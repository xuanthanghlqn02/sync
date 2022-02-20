package SolveExersice;

import java.util.Scanner;

public class QuadraticEquation {
    public static float qD2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT vo so nghiem");
                } else {
                    System.out.println("PT vo nghiem");
                }
            } else {
                System.out.println("PT co nghiem la: " + (-c / b));
            }
        } else {
            float delta = (b * b) - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT Vo nghiem");
            } else {
                if (delta == 0) {
                    System.out.println("PT co nghiem kep x1 = x2 = " + (-b / 2 * a));
                } else {
                    System.out.println("PT co 2 nghiem phan biet:");
                    System.out.println("x1 = " + ((-b + Math.sqrt(delta) / 2 * a)));
                    System.out.println("x2 = " + ((-b - Math.sqrt(delta) / 2 * a)));
                }
            }
        } return qD2(a, b, c);
    }

    public static void main(String[] args) {
        System.out.println("Solve The quadratic Equation 2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = scan.nextFloat();
        System.out.println("Enter b:");
        float b = scan.nextFloat();
        System.out.println("Enter c:");
        float c = scan.nextFloat();
        QuadraticEquation.qD2(a,b,c);
        System.out.println("Ket thuc chuong trinh!");
    }
}
