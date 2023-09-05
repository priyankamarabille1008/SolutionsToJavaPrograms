package Strings;

import java.util.Scanner;

//1.Approach

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int j=0;
		
		for(int i=str.length()-1;i>=0;i--) {
			ch1[j]=ch[i];
			j++;
			}

		String rev="";
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]+" ");
			rev=rev+ch1[i];
		}
		
		System.out.println();
		
		System.out.println(rev+" "+str);
		if(str.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}

}


//2.Approach
//public class ReverseString {
//	public static void main(String[] args) {
//		System.out.println("Enter String:");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		StringBuilder sb=new StringBuilder(str);
//		
//		//reversing string
//		StringBuilder rev=sb.reverse();
//
//		//checking palindrom
//		if(str.equals(rev.toString())) {
//			System.out.println("palindrom");
//		}else {
//			System.out.println("Not palindrom");
//		}
//	}
//
//}

//3.Approach

//public class ReverseString {
//	public static void main(String[] args) {
//		System.out.println("Enter String:");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		for(int i=str.length()-1;i>=0;i--) {
//			String rev[i]=str.charAt(i);
//		}
//		if(str.equals(rev.toString())) {
//			System.out.println("palindrom");
//		}else {
//			System.out.println("Not palindrom");
//		}
//	}
//}

