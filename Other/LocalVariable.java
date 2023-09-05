package Other;
import java.util.*;

class LocalVariable{
    public static void main(String[] args){
        // Dog d=new Dog();
        // d.bark();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        // System.out.println("Cube of " +num + "=" +num*num*num);
        // int cube= (int) Math.pow(num, 3);
        // System.out.println(cube);

        if(num>0){
            System.out.println("number is Positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}

// class Dog{
//     String breek;
//     String name="pupy";
//     Float f;
//     Float weight;
//     public void bark(){
//         Float weight;
//         Float height=5.3f;
//         System.out.println("breek="+breek);
//         System.out.println("name="+name);
//         System.out.println("float="+f);
//         // System.out.println("weight="+weight);
//         System.out.println("height="+height);
//     }
// }