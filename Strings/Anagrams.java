package Strings;

import java.util.Arrays;
import java.util.Scanner;

//public class Anagrams {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str1=sc.nextLine();
//		String str2=sc.nextLine();
//		boolean b=false;
//		if(str1.length()==str2.length()) {
//		for(int i=0;i<str2.length();i++) {
//		if(str1.contains(str2.charAt(i)+"")) {
//			b=true;
//			}
//		}
//		}
//		if(b==true) {
//		System.out.println("is Anagram");
//	}else {
//		System.out.println("Not Nagrams");
//	}
//	}
//
//}
	

//
//public class Anagrams {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str1=sc.nextLine();
//		String str2=sc.nextLine();
//
//		char ch1[]=str1.toCharArray();
//		char ch2[]=str2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//
//		if(Arrays.equals(ch1,ch2)) {
//			System.out.println("Strings are Anagrams");
//		}
//		else {
//			System.out.println("Not Anagrams");
//		}
//	}
//}


public class Anagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		str1.split(" ");
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1.length-i-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					char temp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch2.length-i-1;j++) {
				if(ch2[j]>ch2[j+1]) {
					char temp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			}
		}
		
		
//		if(Arrays.equals(ch1, ch2)) {
//			System.out.println("Strings are Anagrams");
//		}else {
//			System.out.println("String are Not Anagrams");
//		}
		boolean b=false;
		for(int i=0;i<ch1.length;i++) {
//			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[i]) {
					b=true;
					break;
//				}
			}
		}
		if(b==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("No");
		}
	}

}



Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
 String s1=str1.toLowerCase();
 String s2=str2.toLowerCase();
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);

if(Arrays.equals(ch1,ch2)) {
    System.out.println("Anagrams");
}
else {
    System.out.println("Not Anagrams");
}
}
}