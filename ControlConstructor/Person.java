package ControlConstructor;
import java.util.Scanner;

public class Person {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=sc.nextInt();
        if(age>=1 && age<=12){
            System.out.println("Chile");
        }else if(age>=13 && age<=19){
            System.out.println("Teen");
        }else if(age>=20 && age<=35){
            System.out.println("Adult");
        }else if(age>=36 && age<=60){
            System.out.println("Senior Adult");
        }else if(age>60){
            System.out.println("Super senior ");
        }else{
            System.out.println("Enter Proper Age");
        }
    }
    
}
