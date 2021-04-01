import java.util.Scanner;

public class MaxOF2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size 1: ");
        int firstSize = scanner.nextInt();

        System.out.println("Input size 2: ");
        int secondSize = scanner.nextInt();
        int[][] arr = new int[firstSize][secondSize];

        for (int i = 0; i < firstSize; i++) {
            for (int j = 0; j < secondSize; j++) {
                arr[i][j] = (int) Math.round(Math.random()*100-1);
            }
        }
        System.out.println("Elements of arr: ");
        for (int i = 0; i < firstSize; i++) {
            System.out.print("{ \t");
            for (int j = 0; j < secondSize; j++) {
                System.out.printf("%02d \t",arr[i][j]);
            }
            System.out.println(" }");
        }


    }

}
