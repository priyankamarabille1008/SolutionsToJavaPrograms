package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		str=str.toLowerCase();
		char ch1[]=str.toCharArray();
		Arrays.sort(ch1);
		boolean b=false;
		int c=0;
		for(char i='a';i<='z';i++) {
			for(int j=0;j<ch1.length;j++) {
				if(i==ch1[j]) {
					b=true;
					break;
				}
			}
		if(b==true) {
			c++;
		}break;
		}
		if(c==26) {
			System.out.println("Panagram");
		}else {
			System.out.println("not");
		}
	}
}
