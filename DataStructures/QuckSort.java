package DataStructures;
import java.util.Scanner;

public class QuckSort {

    public static int Partition(int arr[],int low,int high){
        int p=arr[high];
        int j=low-1;
        for(int i=low;i<=arr.length-1;i++){
            if(arr[i]<p){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j+1];
        arr[j+1]=arr[high];
        high=temp;
        return j+1;
    }
    public static void Sorting(int arr[],int low,int high){
        if(low<high){
            int p=Partition(arr, low, high);
            Sorting(arr,low,p-1);
            Sorting(arr, p+1, high);
        }
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        Sorting(arr, low, high);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
