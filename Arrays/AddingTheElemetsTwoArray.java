package Arrays;
import java.util.Scanner;
public class AddingTheElemetsTwoArray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size: ");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("enter Elements in First array");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int b[]=new int[n];
            System.out.println("enter Elements in Second array");
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
           int c[]=new int[n];
           int j=0;
           while(j<n){
            for(int i=0;i<n;i++){
                c[j]=a[i]+b[i];
                j++;
            }
           }
           System.out.println("First Array is: ");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }System.out.println();
            System.out.println("Second Array is: ");
            for(int i=0;i<a.length;i++){
                System.out.print(b[i]+" ");
            }System.out.println();
            System.out.println("third array is: ");
            for(int i=0;i<b.length;i++){
                System.out.print(c[i]+" ");
            }
        }
    }
    
