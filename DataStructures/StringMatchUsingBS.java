package DataStructures;
import java.util.Scanner;

public class StringMatchUsingBS {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int len=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[len];
        System.out.println("Enter Names in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        int l=0;int h=arr.length-1;
        int mid=(l+h)/2;
        System.out.println("Enter Name to search  ");
        String key=sc.nextLine();
        int idx=0;
        boolean b=false;
        while(l<=h){
            for(int i=0;i<arr.length;i++){
            int p=key.compareTo(arr[i]);
            if(p==0){
                b=true;
                idx=i;
            }
            else if(p>0){
                l=mid+1;
            }
                h=mid-1;
            }
        }
            if(b==true){
                System.out.println(idx);
            }
    }
}
