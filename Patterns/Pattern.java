package Patterns;
// 1.Pattern Example
// 1
// 2*3
// 4*5*6
// 7*8*9*10

// public class Pattern {
//     public static void main(String[] args) {
//         int x=1;
//         for(int i=1;i<5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(x);
//                 x++;
//                 if(j<i){
//                 System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// 2.Second Pattern Example

// 10 
// 20 30 
// 40 50 60
// 70 80 90 100


// class Pattern{
//     public static void main(String[] args) {
//          int x=1;
//         for(int i=1;i<5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(x*10+" ");
//                 x++;
//             }
//             System.out.println();
//         }
//     }
// }

// 3. Problem
// 1
// 01
// 101
// 0101
// 10101


// class Pattern{
//     public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             int x=i+j;
//             if(x%2==0){
//             System.out.print(1);
//             }else{
//                 System.out.print(0);
//             }
//         }
//         System.out.println();
//        }
//     }
// }

// 4.Butterfly Pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


// class Pattern{
//     public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=2*(4-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//        for(int i=4;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=2*(4-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
// }


// 4.Peramid Pattern

//     * 
//    * *
//   * * *
//  * * * *
// * * * * *

// class Pattern{
//     public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//         for(int j=1;j<=5-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//        }
//     }
// }

// 6.Daimond Pattern

//         * 
//        * *
//       * * *
//      * * * *
//     * * * * *
//     * * * * * 
//      * * * *
//       * * * 
//        * *
//         *

 class Pattern{
     public static void main(String[] args) {
        for(int i=1;i<=5;i++){
         for(int j=1;j<=5-i;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print("*"+" ");
         }
         System.out.println();
        }
        for(int i=5;i>=1;i--){
         for(int j=1;j<=5-i;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print("*"+" ");
         }
         System.out.println();
        }
     }
 }

// class Pattern{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(i==1 || j==1){
//                 System.out.print("*");
//                 }
//             }
//             for(int j=2;j<=2*i;j++){
//                 System.out.print(" ");
//             }System.out.print("*");
            
//             System.out.println();
//         }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(i==1 || j==1){
//                 System.out.print("*");
//                 }
//             }
//             for(int j=2;j<=2*i;j++){
//                 System.out.print(" ");
//             }System.out.print("*");
            
//             System.out.println();
//         }
//     }
// }



// class Pattern{
//     public static void main(String[] args) {
//        for(int i=5;i>=1;i--){
//         for(int j=1;j<=5-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//        }
//        for(int i=1;i<=5;i++){
//         for(int j=1;j<=5-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//        }
//     }
// }


//class Pattern{
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=5;j++){
//                if(j==i){
//                    System.out.print("*");
//                }
//            }
//            for(int j=1;j<=2*(5-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=5;j>=1;j--){
//                if(i==j){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=5;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=5;j++){
//                if(j==i){
//                    System.out.print("*");
//                }
//            }
//            for(int j=1;j<=2*(5-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=5;j>=1;j--){
//                if(i==j){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}