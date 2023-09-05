package Arrays;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter marks for subjecte: "+i);
            marks[i]=sc.nextInt();
        }
        double total=0.0;
        for(int i=0;i<n;i++){
            total=total+marks[i];
        }
        double percentage=(total/(n*100))*100;
        int highest=marks[0];
        for(int i=1;i<n;i++){
            if(highest<marks[i]){
                highest=marks[i];
            }
        }
        System.out.println("Percentage = "+percentage);
        System.out.println("highest Marks = "+highest);
    }
}
