package DataStructures;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // static void elePresentLeft(int arr[]) {

    // }

    // static void elePresentRight(int arr[], int key) {

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter Elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array is: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();
        // elePresentLeft()
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        boolean isPresent=false;
        while ( low<=high) {
            if (arr[mid]==key) {
                isPresent=true;
                break;
            // System.out.println("key present in" + mid);
            }
            else if (arr[mid]<key) {
                low = mid + 1;
                mid = (low + high) / 2;
            }
            else if(arr[mid]>key){
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        if(isPresent==true){
            System.out.println("element present in "+mid);
        }
        else{
            System.out.println("Element not present in array");
        }
    }
}
