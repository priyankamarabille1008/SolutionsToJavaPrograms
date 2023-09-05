package Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        for (int j = 0; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = first;
        System.out.println("array is: ");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

}
