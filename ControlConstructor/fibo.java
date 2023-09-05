package ControlConstructor;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Number: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci Series is: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
    
}


// class fibo{
//     public static void fiboSeries(int n,int a,int b){
//         if(n==1){
//             return;
//         }
//         int fib=a+b;
//         fiboSeries(n-1,b,fib);
//         System.out.println(fib);
//     }
//     public static void main(String[] args) {
//     int n=8,a=0,b=1;

//     fibo.fiboSeries(n,a,b);
//     }
// }