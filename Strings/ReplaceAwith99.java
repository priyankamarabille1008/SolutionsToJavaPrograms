package Strings;

import java.util.Scanner;

public class ReplaceAwith99 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String str2="";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				str2+="99";
			}
			else {
				str2+=ch[i];
			}
		}
		System.out.println(str2);
	}
}
