package demo1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] result = enterArray();
        printArray(result);
    }

    public static int[] enterArray() {
        int[] number = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first elenment: ");
        number[0] = scan.nextInt();
        System.out.println("Enter the second elenment: ");
        number[1] = scan.nextInt();
        System.out.println("Enter the third elenment: ");
        number[2] = scan.nextInt();
        System.out.println("Enter the 4th elenment: ");
        number[3] = scan.nextInt();
//        System.out.println("Enter the 5th elenment: ");
//        number[4] = scan.nextInt();
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]);
//        }
        //   System.out.println(number);
        return number;
    }

    public static void printArray(int[] number) {
//        int[] number = new int[4];
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public static int[] sortUp(int[] number) {
        for (int i = 0; i < number.length; i++) {

        }
        return number;
    }
}