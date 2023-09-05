package Strings;

import java.util.Scanner;

public class LargestSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int lgsub=0;
		String st="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String s=ch[i]+"";
			for(int j=i+1;j<ch.length;j++) {
				if(!s.contains(ch[j]+"")) {
					s=s+ch[j];
				}
				if(lgsub<s.length()) {
					lgsub=s.length();
					st=s;
				}
			}
		}
		System.out.println(st);
		System.out.println(lgsub);
	}
}
