package Arrays;
import java.util.Scanner;

public class MergeEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n = sc.nextInt();
        System.out.println("Enter size of Second array");
        int m = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in first array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        System.out.println("Enter elements in second array");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (b[i] % 2 == 0) {
                count++;
            }
        }

        int c[] = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                c[index] = a[i];
                index++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (b[i] % 2 == 0) {
                c[index] = b[i];
                index++;
            }
        }

        System.out.println("First array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Second array is");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("Merged array of even numbers is");
        for (int i = 0; i < count; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
