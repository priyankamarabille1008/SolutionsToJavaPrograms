package Strings;

import java.util.Scanner;

//public class SearchChar {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		 char key=sc.nextLine().charAt(0);
//		if(str.contains(key+"")) {
//			System.out.println(" present at index "+str.indexOf(key));
//		}else {
//			System.out.println("Key not Present");
//		}
//	}
//}


public class SearchChar {
	public static void main(String[] args) {
//		String str="Kodnest";
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Key to Search");
		 char key=sc.nextLine().charAt(0);	
		char ch[]=str.toCharArray();
		boolean b=false;
		int idx=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]==key) {
				b=true;
				idx=i;
				break;
			}
		}
		if(b==true) {
			System.out.println("Present at index  "+idx);
		}else {
			System.out.println("not present");
		}
	}
}