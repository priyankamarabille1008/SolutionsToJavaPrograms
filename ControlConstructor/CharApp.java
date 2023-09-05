package ControlConstructor;
import java.util.Scanner;

public class CharApp {
    Scanner sc=new Scanner(System.in);
    public char inputChar(){
        System.out.println("Enter charector or digit or other Symbol : ");
        char ch=sc.nextLine().charAt(0);
        return ch;
    }
    public void classifyChar(char c){
        if((c>=65 && c<=90)||(c>=97 && c<=122)){
        // if((c>='a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println("Alphabet");
        }else if(c>=48 && c<=57){
            System.out.println("DIgit");
        }else{
            System.out.println("Other Symbol");
        }
    }
    public static void main(String[] args){
        CharApp ca=new CharApp();
        char ch=ca.inputChar();
        ca.classifyChar(ch);
    }
}
