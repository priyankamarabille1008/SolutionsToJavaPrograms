package DataStructures;
import java.util.Scanner;

public class StringMatching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter Strng to search");
        String ptr=sc.nextLine();

        int n=str.length();
        int m=ptr.length();
        for(int i=0;i<(n-m-1);i++){
            int j=0;
            while(j<m && ptr.charAt(j)==str.charAt(i+j)){
                j++;
            }
            if(j==m){
                System.out.println("index starts from "+i);
            }
        }
    }
}
