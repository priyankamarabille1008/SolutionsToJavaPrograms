package Arrays;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        String[] name=new String[n];
        // sc.nextLine();
        System.out.println("Enter names in array");
        for(int i=0;i<n;i++){
            name[i]=sc.next();
        }
        System.out.println("Names are:");
        for(String ele:name){
            System.out.println(ele);
        }
    }
}
