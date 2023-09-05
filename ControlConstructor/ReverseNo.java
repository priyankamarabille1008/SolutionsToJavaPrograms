package ControlConstructor;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int reverse=0;
        int original=number;
        while(number!=0){
            reverse=reverse*10;
            reverse=reverse+number%10;
            number=number/10;
        }
        if(original==reverse){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
        
    }
}

// System.out.print(reverse);