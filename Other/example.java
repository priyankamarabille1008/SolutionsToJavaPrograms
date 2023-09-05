package Other;
class Example{
    public static void fun1(){
        System.out.println("Func1 method executing");
    }
    public static String fun2(){
       String msg="fun2 method executing";
       return msg;
    }
    public static void main(String[] args){
       fun1();
       System.out.println(fun2());
    }
}