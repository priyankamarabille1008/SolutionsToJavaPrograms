package DataStructures;
// import java.util.Scanner;

// public class InsertionSort {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter the elements");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=1;i<size;i++){
//             int key=arr[i];
//             int j=i-1;
//             while(j>=0  && key<arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=key;
//         }
//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

import java.util.Scanner;

class InsertionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}