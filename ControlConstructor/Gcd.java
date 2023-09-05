package ControlConstructor;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n1=sc.nextInt();
        System.out.println("Enetr the second number");
        int n2=sc.nextInt();
        int rem,gcd=0;
        while(n2!=0){
            rem=n2;
            n2=n1%n2;
            n1=rem;
        }
        gcd=n1;
        System.out.println(gcd);
    }
    
}
