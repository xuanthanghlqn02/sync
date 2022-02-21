package demo1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 2;
        numbers[4] = 1;
//        System.out.println("The min element is: ");
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            // int min = numbers[0];
//            if (min > numbers[i]) {
//                min = numbers[i];
//              //  System.out.println(min);
//            } //System.out.println(min);
//        } System.out.println(min);
        System.out.println("Sap xep theo thu tu tang dan: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

//        Scanner sc = new Scanner(System.in);
//        String[] strArray =
        System.out.println("----------------------------------------");

        String name = "ngOc"; //Ngoc
        String firstChar = String.valueOf(name.charAt(0));
        String rs =firstChar.toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(rs);
    }
}
