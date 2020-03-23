import java.util.Scanner;

public class SumOfColumnIn2dArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int column;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
        do {
            System.out.println("Enter column: ");
            column = scanner.nextInt();
            if (column < 1 || column > array.length){
                System.out.println("Error");
            }
        } while (column < 1 || column > array.length);
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column-1];
        }
        System.out.println("Sum of Column " + column + ": " + sum);
    }
}
