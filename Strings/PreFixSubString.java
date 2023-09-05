package Strings;

import java.util.Arrays;
import java.util.Scanner;
//
//public class PreFixSubString {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String a[]=new String[5];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextLine();
//		}
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		int minlen=Math.min(a[0].length(), a[a.length-1].length());
//		int i=0;
//		while(i<minlen && a[0].charAt(i)==a[a.length-1].charAt(i)) {
//			i++;
//		}
//		String str=a[0].substring(0,i);
//		System.out.print(str);
//	}
//}



public class PreFixSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a[]=new String[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextLine();
		}
		String res=a[0];
		for(int i=1;i<a.length;i++) {
			while(a[i].indexOf(res)!=0) {
				res=res.substring(0,res.length()-1);
				
				if(res.isEmpty()) {
					System.out.print("Not has prifix");
				}
			}
		}
		System.out.print(res);
	}
}