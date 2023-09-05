package ControlConstructor;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number: ");
        int n=sc.nextInt();
        int p=1;
        for(int i=5;i>=1;i--){
            p=p*i;
        }
        System.out.println("Factorial of "+n+" = "+p);
    }
}
