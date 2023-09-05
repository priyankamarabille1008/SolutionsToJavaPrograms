package DataStructures;
import java.util.Scanner;

//import javax.swing.text.html.parser.Element;

public class BubbleSortExample2 {
    public void arrangeAscending(int[] arr){
        int size=arr.length;
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
    public void arrangeDescending(int[] arr){
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]<arr[j+1]){
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSortExample2 bs=new BubbleSortExample2();
        System.out.println("Enter your choice \n1.Ascending Order \n2. Descending order");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Elemenst in Ascending order are:");
            bs.arrangeAscending(arr);
            break;
            case 2:
            System.out.println("Elemenst in Descending order are:");
            bs.arrangeDescending(arr);
            break;
            default:
            System.out.println("Enter Correct Choice");
        }
    }
}

