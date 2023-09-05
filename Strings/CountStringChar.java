package Strings;

import java.util.Scanner;

public class CountStringChar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String ov="aeiou";
		int alp=0;int dig=0;int sp=0;int ovel=0;int con=0;int cap=0;
		String llstr=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				llstr +=str.charAt(i);
				if(ov.contains(str.charAt(i)+"")) {
					ovel++;
					
				}else {
					con++;
				}
				cap++;
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(ov.contains(str.charAt(i)+"")) {
					ovel++;
				}else {
					con++;
				}
				alp++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				dig++;
			}else {
			sp++;
			}
		}
		System.out.println("Small Alphabets   "+alp);
		
		System.out.println("Capital Alphabets "+cap);
		System.out.println("Number of digits  "+dig);
		System.out.println("Number of other char  "+sp);
		System.out.println("Number of Ovels  "+ovel);
		System.out.println("the the ovels are "+llstr);
		System.out.println("Number of Consonats  "+con);
	}
}
