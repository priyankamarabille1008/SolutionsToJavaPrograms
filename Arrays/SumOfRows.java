package Arrays;
import java.util.Scanner;

public class SumOfRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int arr[][] = new int[rows][cols];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int largestSum = 0;
        int idx = -1;
        
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                idx = i;
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
        
        if (idx != -1) {
            System.out.print("Elements in the row: ");
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[idx][j] + " ");
            }
        }
    }
}
