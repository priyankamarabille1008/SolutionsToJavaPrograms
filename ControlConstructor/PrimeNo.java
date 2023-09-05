package ControlConstructor;
import java.util.Scanner;

// public class PrimeNo {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enetr Number");
//         int n=sc.nextInt();
//         int fact=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 fact++;
//             }
//         }
//         if(fact==2){
//             System.out.println("Prime number");
//         }else{
//             System.out.println("Not Prime");
//         }
//     }
    
// }


public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Number");
        int n=sc.nextInt();
        int prm=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                prm++;
            }
        }
        if(prm==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime");
        }
    }
}


// public class PrimeNo {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enetr first Number");
//         int n1=sc.nextInt();
//         System.out.println("Enetr Second Number");
//         int n2=sc.nextInt(); 
//         int prm=0;
//         for(int j=n1;j<=n2;j++){
//             prm=1;
//             for(int i=2;i<=j/2;++i){
//                 if(j%i==0){
//                 prm=0;
//                 break;
//                 }
//             } 
//             if(prm==1){
//                 System.out.println(j);
//             }
//         } 
//     }
// }