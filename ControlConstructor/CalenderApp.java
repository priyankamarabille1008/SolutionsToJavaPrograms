package ControlConstructor;
import java.util.Scanner;

class App1 {
    Scanner sc=new Scanner(System.in);
    public boolean isLeapYear(){
        System.out.print("It is a leap year?");
        System.out.println("\n Enter Y for Yes \n Enter N for No :");
        char lp=sc.nextLine().charAt(0);		//char input from user
        boolean res=false;
        if(lp=='y'){
            res=true;
        }else if(lp=='n'){
            res=false;
        }
        return res;
    }
    public int inputMonth(){
        System.out.println("Select Month\n1.jan\n2.feb3.mar\n4.april\n5.may\n6.june\n7.july\n8.aug\n9.sep\n10.oct\n11.Nov\n12.dec.");
        int m=sc.nextInt();
        return m;
    }
    public void calculateDays(int month){
        switch(month){
            case 1:System.out.println("Jan has 31");
            break;
            case 2:System.out.println("feb has 29");
            break;
             case 3:System.out.println("mar has 31");
            break;
             case 4:System.out.println("apl has 30");
            break;
             case 5:System.out.println("may has 31");
            break;
            case 6:System.out.println("june has 30");
            break;
            case 7:System.out.println("july has 31");
            break;
            case 8:System.out.println("aug has 31");
            break;
            case 9:System.out.println("sep has 30");
            break;
            case 10:System.out.println("oct has 31");
            break;
             case 11:System.out.println("nov has 30");
            break;
             case 12:System.out.println("dec has 31");
            break;
        }
    }
}
public class CalenderApp{
    public static void main(String[] args){
        App1 a=new App1();
        boolean y=a.isLeapYear();
        // System.err.println(res);
        int month=a.inputMonth();
        if(month==2 && y==false){
            System.out.println("feb has 28");
        }else{
        a.calculateDays(month);
        }
    }
    
}
