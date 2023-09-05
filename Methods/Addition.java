package Methods;
public class Addition {

    public static int findSum(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args){
        int s=findSum(10,20);
        System.out.println("Sum="+s);
    }
    
}


// public static int findSum(){
//         int a=10;
//         int b=20;
//         int sum =a+b;
//         return sum;
//     }
//     public static void main(String[] args){
//         int s=findSum();
//         System.out.println("Sum="+s);
//     }