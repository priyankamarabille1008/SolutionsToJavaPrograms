package DataStructures;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        // }
        System.out.println("Sorted elemenst");
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }
}
