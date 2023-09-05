package Strings;

import java.util.Scanner;

//public class FrequencyOfChar {
//	public static void main(String[] args) {
//		System.out.println("Enter String:");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		System.out.println("Key to Search");
//		char key=sc.nextLine().charAt(0);
//		char ch[]=str.toCharArray();
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			if(ch[i]==key) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//}


public class FrequencyOfChar {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Key to Search");
		char key=sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==key) {
				count++;
			}
		}
		System.out.println(count);
	}
}

