package ControlConstructor;
import java.util.Scanner;

class VoteApp {

    public int inputAge(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Age");
        int age=sc.nextInt();
        return age;
    }

    public boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    
}

class App{
    public static void main(String[] args){
        VoteApp av=new VoteApp();
        int num=av.inputAge();
        boolean res=av.isEligible(num);
        // System.out.println(res);
        if(res==true){
            System.out.println("Person is eligible to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
    }
}
