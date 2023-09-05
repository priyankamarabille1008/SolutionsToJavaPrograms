package Strings;

import java.util.Scanner;

//public class StringWordsCharReverse {
//	public static void main(String[] args) {
//		System.out.println("Enter String:");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String[] str2=str.split(" ");
//		for(int i=0;i<str2.length;i++) {
////			System.out.print(str2[i]+" ");
//			for(int j=str2[i].length()-1;j>=0;j--) {
//				System.out.print(str2[i].charAt(j));
//			} System.out.print(" ");
//		}
//	}
//}


//public class StringWordsCharReverse {
//	public static void main(String[] args) {
//		System.out.println("Enter String:");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String[] str2=str.split(" ");
//		for(int i=0;i<str2.length;i++) {
//			StringBuilder sb=new StringBuilder(str2[i]);
//				System.out.print(sb.reverse()+" ");
//			}
//		}
//}


public class StringWordsCharReverse {
public static void main(String[] args) {
	System.out.println("Enter String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
//	String[] str2=str.split(" ");
//	for(int i=0;i<str.length();i++) {
	int i=0;
	while(i<str.length()) {
		if(str.charAt(i)==' '){
			i++;
		}
		StringBuilder sb=new StringBuilder(str.charAt(i));
		System.out.print(sb.reverse()+" ");
//	}
	}
}
}
