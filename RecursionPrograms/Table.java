package RecursionPrograms;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		System.out.println("Enter number which table need to print");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printTable(n,1);
	}
	public static void printTable(int n,int times) {
		if(times==11) {
			return;
		}
		System.out.println(n+" x "+ times+" = " +(n*times));
		printTable(n,times+1);
	}
}
