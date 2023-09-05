package Strings;

import java.util.Scanner;

public class CapitalToSmallAndSTC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>64 && ch[i]<=90) {
				ch[i]+=32;
			}else if(ch[i]>96 && ch[i]<=122) {
				ch[i]-=32;
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
