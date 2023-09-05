package ControlConstructor;
import java.util.Scanner;

// class Calci {
//     public void add(int a, int b) {
//         int sum = a + b;
//         System.out.println("Addition is= " + sum);
//     }

//     public void sub(int a, int b) {
//         int substract = a - b;
//         System.out.println("Substraction is= " + substract);
//     }

//     public void mul(int a, int b) {
//         int multiply = a * b;
//         System.out.println("Multiplication is= " + multiply);
//     }

//     public void div(int a, int b) {
//         double divide = a / (double)b;
//         System.out.println("Division is= " + divide);
//     }
// }

// public class CalciApp {
//     public static void main(String[] args) {
//         Calci cl = new Calci();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your choice \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division ");
//         int choice = sc.nextInt();
//         System.out.println("Enter first Number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter Second Number");
//         int num2 = sc.nextInt();
//         if (choice == 1) {
//             cl.add(num1, num2);
//         } else if (choice == 2) {
//             cl.sub(num1, num2);
//         } else if (choice == 3) {
//             cl.mul(num1, num2);
//         } else if (choice == 4) {
//             cl.div(num1, num2);
//         }
//         else{
//             System.out.println("You entered wrong choice");
//         }
//     }
// }

class Calci{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public double div(int a,int b){
        return a/(double)b;
    }
}

public class CalciApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enetr the Operator\n1. + :Add\n2. - :Sub\n3. * :Multiple\n4. / :Div");
        char op=sc.nextLine().charAt(0);
        Calci c=new Calci();
        if(op=='+' || op=='-' || op=='*' || op=='/'){
            System.out.println("Enter Two Numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter your Choice");
            switch(op){
                case '+':
                int sum=c.add(a, b);
                System.out.println("Addition= "+sum);
                break;
                case '-':
                int substraction=c.add(a, b);
                System.out.println("substraction= "+substraction);
                break;
                case '*':
                int multiply=c.mul(a, b);
                System.out.println("Multiplication= "+multiply);
                break;
                case '/':
                double divide=c.div(a, b);
                System.out.println("Division= "+divide);
                break;
            }   
        }
        else{
            System.out.println("Enter valid input");
        }
    }
}
