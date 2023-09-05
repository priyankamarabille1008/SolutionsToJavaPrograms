package Strings;

import java.util.Scanner;
//
//public class SubStrings {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		String str=sc.nextLine();
//		String s="";
//		for(int i=0;i<str.length();i++) {
//			for(int j=i;j<str.length();j++) {
//				s=s+str.charAt(j);
//				System.out.println(s);
//			}
//			System.out.println();
//			s="";
//		}
//	}
//
//}


public class SubStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String s=ch[i]+"";
			System.out.println(s);
			for(int j=i+1;j<ch.length;j++) {
				s=s+ch[j];
				System.out.println(s);
			}
			System.out.println();
		}
	}
}
