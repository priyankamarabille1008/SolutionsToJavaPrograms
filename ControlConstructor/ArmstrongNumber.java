package ControlConstructor;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int cube=0;
        int n=0;
        int original=number;
        while(number!=0){
            n=number % 10;
            cube+=Math.pow(n, 3);
            number/=10;
        }
        if(original==cube){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }
}

