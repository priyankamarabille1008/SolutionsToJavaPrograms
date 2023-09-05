package Arrays;
import java.util.Scanner;

public class ReplaceEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        System.out.println("Elements are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
