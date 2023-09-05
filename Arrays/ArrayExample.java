package Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of String Array: ");
        int n=sc.nextInt();
        String name[]=new String[n];
        sc.nextLine();
        for(int i=0;i<name.length;i++){
            System.out.println("Enter Name for "+i);
            name[i]=sc.nextLine();
        }
         for(int i=0;i<name.length;i++){
            System.out.println("Name of "+i+"  :"+name[i]);
        }
    }
}
