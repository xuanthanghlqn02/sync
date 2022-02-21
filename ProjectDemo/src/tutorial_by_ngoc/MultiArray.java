package tutorial_by_ngoc;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][3]; //4 hàng, 3 cột
        arr[0][0] = 5;
        arr[0][1] = 3;
        arr[0][2] = 8;
        arr[1][0] = 2;
        arr[1][1] = 9;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 0;
        arr[2][2] = 1;
        arr[3][0] = 3;
        arr[3][1] = 5;
        arr[3][2] = 8;

        System.out.println("số hàng = " +arr.length);
        System.out.println("Số cột ở hàng 0: " + arr[0].length);
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Ma trận vuông: ");
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Đường chéo chính: ");
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    System.out.println(array[i][j]);
                }
            }

        }
    }
}
