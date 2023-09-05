package DataStructures;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int n=sc.nextInt();
        System.out.println("enter size of Second array");
        int m=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enyet elemts in first array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[m];
        System.out.println("enyet elemts in second array");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int l=n+m;
        int c[]=new int[l];
        int k=0;
        while(k<n){
            for(int i=0;i<n;i++){
                c[k]=a[i];
                k++;
            }
        }
        int p=n;
        while(p<l){
            for(int i=0;i<m;i++){
                c[p]=b[i];
                p++;
            }
        }
        System.out.println("first array is");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
        System.out.println("second array is");
        for(int i=0;i<m;i++){
            System.out.print(b[i]+" ");
        }System.out.println();
        System.out.println("third array is");
        for(int i=0;i<l;i++){
            System.out.print(c[i]+" ");
        }
    }
}
