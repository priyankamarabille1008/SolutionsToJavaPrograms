package Strings;

import java.util.Scanner;

public class PrintCharAfterTwoChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='Z' || ch[i]=='Y') {
				ch[i]-=25;
			}else if(ch[i]=='z' || ch[i]=='y') {
				ch[i]-=25;
			}else {
			ch[i]+=2;
		}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}
}
