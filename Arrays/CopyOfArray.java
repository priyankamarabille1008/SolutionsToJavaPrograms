package Arrays;
import java.util.Scanner;

class CopyOfArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter Elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("First Array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int b[]=new int[n];
        b=a;
        System.out.println("Second array is: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}