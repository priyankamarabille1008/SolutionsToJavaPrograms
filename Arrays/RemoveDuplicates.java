package Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        
        int a[] = new int[len];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[len - 1];
        
        int newLength = j; 
        for (int i = 0; i < newLength; i++) {
            a[i] = temp[i];
        }
        
        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < newLength; i++) {
            System.out.println(a[i]);
        }
    }
}
