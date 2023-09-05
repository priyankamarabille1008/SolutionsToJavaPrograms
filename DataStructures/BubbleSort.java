package DataStructures;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //bubbleSort
        int temp=0;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
