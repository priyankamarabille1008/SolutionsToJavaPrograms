package Other;
import java.util.Scanner;

public class CircleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of 2 D array");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter Elements in array");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        while()
    }
}
