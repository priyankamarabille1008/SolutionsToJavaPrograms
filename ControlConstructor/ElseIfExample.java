package ControlConstructor;
import java.util.Scanner;

class Example{
    public int inputMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        return marks;
    }

    public void ladderExample(int marks){
        if(marks>90){
            System.out.println("You got Laptop");
        }
        else if(marks >80 && marks<=90){
            System.out.println("You got Smart Phone");
        }
        else if(marks > 65 && marks<=80){
            System.out.println("You got Bicycle");
        }
        else if(marks >40 && marks <=65){
            System.out.println("You got Watch");
        }
        else{
            System.out.println("get Lost");
        }
    }
}

public class ElseIfExample {
    public static void main(String[] args){
        Example e=new Example();
        int marks=e.inputMarks();
        e.ladderExample(marks);
    }   
}
