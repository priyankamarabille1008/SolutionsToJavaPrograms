package Strings;

import java.util.Scanner;

public class ValidString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		boolean b=false;
		if(str.length()>=8 && str.length()<=30) {
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || ch[i]>=0 && ch[i]<=9){
					if(ch[0]>='a' && ch[0]<='z' || ch[i]>='A' && ch[i]<='Z') {
						b=true;
					}
				}
			}
		}
		if(b==true) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
