package Methods;
class Addition1{
    public static int add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("sum= "+sum);
        return sum;
    }
}

public class Calculator {
    public static void main(String[] args){
     int a1=Addition1.add();
     System.out.println(a1);
    }
}
