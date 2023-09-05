package DataStructures;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr numbe rof Students:");
        int n=sc.nextInt();
        int roll[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter roll:");
            roll[i]=sc.nextInt();
        }
        System.out.println("Enter kay to search");
        int key=sc.nextInt();
        boolean present=false;
        int index=0;
        for(int i=0;i<n;i++){
            if(roll[i]==key){
               present=true;
               index=roll[i];
                break;
            }
            } 
            if(present==true){
                System.out.println("Element present "+index);
            }else{
                System.out.println("Element Not present ");
            }
        }
    }
