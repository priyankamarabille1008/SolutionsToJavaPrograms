package Assesments;
public class Assesment2 {

    public static int substractNumber(int num1,int num2){

        return num1-num2;
    }
    public static int multipleNumber(int num1,int num2){
        return num1*num2;
    }
    public static double divideNumber(int num1,int num2){
        return num1/num2;
        
    }
    public static int findRemainder(int num1,int num2){
        return num1%num2;
    }
    public static void main(String[] args){
        System.out.println(substractNumber(20, 5));
        System.out.println(multipleNumber(4, 5));
        double d=divideNumber(20, 4);
        System.out.println(String.format("%,.2f",d));
        
        System.out.println(findRemainder(10, 3));

    }
}
