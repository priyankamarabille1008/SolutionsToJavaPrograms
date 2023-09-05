package DataStructures;
// import java.util.Scanner;

// public class SearchingString {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int len=sc.nextInt();
//         sc.nextLine();
//         String arr[]=new String[len];
//         System.out.println("Enter Names in array");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextLine();
//         }
//         System.out.println("Names are");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"|");
//         }   
//         System.out.println();
//         boolean isPresent=false;
//         int index=0;
//         System.out.println("Enter Name to search  ");
//         String key=sc.nextLine();
//         for(int i=0;i<arr.length;i++){
//             String str=arr[i];
//             if(key.equals(str)){
//                 isPresent=true;
//                 index=i;
//             }
//         }  
//         if(isPresent==true){
//             System.out.println("Name present at  "+index);
//         }  else{
//             System.out.println("Name not Present");
//         }
//     }
// }

import java.util.Scanner;

class SearchingString{
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
        System.out.println("Enter Name to search  ");
        String key=sc.nextLine();
        for(int i=0;i<arr.length;i++){
            if(key.equals(arr[i])){
                System.out.println("Name Present at  "+i);
                System.exit(0);
            }
        }
        System.out.println("Name not found");
        
    }
}