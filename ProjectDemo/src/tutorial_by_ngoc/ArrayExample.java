package tutorial_by_ngoc;

public class ArrayExample {
    public static void main(String[] args) {
        int[] intArray = createArray();
        printArray(intArray);

        intArray[0] = 7;
        System.out.println("Mảng sau khi cập nhật");
        printArray(intArray);

//
//        numbers[0] = 4;
//        System.out.println("\n Mảng sau khi cập nhật: ");
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + "\t");
//        }
//
//        System.out.println("\n Các phần tử chẵn trong mảng: ");
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] % 2 ==0 ){
//                System.out.print(numbers[i] + "\t");
//            }
//        }
//
//        System.out.println();
//        int min = numbers[0];
//        for(int i = 0; i < numbers.length; i++ ){
//            if(min > numbers[i]){
//                min = numbers[i];
//
//            }
////            System.out.println("numbers[i]:" + numbers[i]);
////            System.out.println("min sau khi cập nhật: " + min);
//        }
//        System.out.println("Phần tử nhỏ nhất là: " + min);
//
        System.out.println("Sắp xếp tăng dần: ");
        sapXepTangDan(intArray);
        printArray(intArray);

        System.out.println("Mảng number: ");
        int[] number = {1,5,3,4,8,9,2};
        printArray(number);
        System.out.println("Sắp xếp tăng dần: ");
        sapXepTangDan(number);
        printArray(number);

        System.out.println("Sử dụng foreach: ");
        for(int x: number){
            System.out.print(x + "\t");
        }
        System.out.println();

        //Mảng kiểu String
        String [] strArray = createArrayString();
        for(String s: strArray){
            System.out.print(s + "\t");
        }

        for (int i = 0; i < strArray.length; i++){
            if(strArray[i].equals("JS")){
                strArray[i] = "JavaScript";
            }
        }
        System.out.println("\n Mảng sau khi cập nhật");
        for(String s: strArray){
            System.out.print(s + "\t");
        }


////        String[] names = {"Java", "HTML/CSS", "JS", "Python"};
////
////        System.out.println("\nKích thước mảng: " + names.length);
////
////        System.out.println(names[2]);
////        for(int i = 0 ; i < names.length; i++){
////            System.out.println(names[i]);
////        }
//        System.out.println("\n--------------------------");
//        Scanner sc = new Scanner(System.in);
//        String[] strArray = new String[4];
//        for (int i = 0 ; i < strArray.length; i++){
//            System.out.println("Nhập phần tử thứ " + i + " : ");
//            strArray[i] = sc.nextLine();
//        }
//
//        for (int i = 0 ; i < strArray.length; i++){
//            System.out.println(strArray[i]);
//        }
//
//        String str = "java";
//        int count = 0;
//
//        for(int i = 0; i < strArray.length; i++){
//            if(strArray[i].toLowerCase().contains(str.toLowerCase())){
//                count++;
//            }
//        }
//        System.out.println("Số phần tử chứa java là: " + count);

//        String str = "Học    lập trình Java không khó";
//        String[] strArr = str.split("\\s+");
//        for (int i = 0; i < strArr.length; i++){
//            System.out.println(strArr[i]);
//        }

//        String name = "ngOc"; //Ngoc
//        String firstChar = String.valueOf(name.charAt(0));
//        String rs = firstChar.toUpperCase() + name.substring(1).toLowerCase();
//        System.out.println(rs);
    }

    public static int[] createArray(){
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 2;
        numbers[4] = 1;

        return numbers;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void sapXepTangDan(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            for (int j = i + 1; j < intArray.length; j++){
                if(intArray[i] > intArray[j]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public static String[] createArrayString(){
        String[] names = {"Java", "HTML/CSS", "JS", "Python"};
        return names;
    }
}
