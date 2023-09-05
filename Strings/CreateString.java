package Strings;

public class CreateString {
	public static void main(String[] args) {
//		String s1="Java";
//		String s2="Java";
//		String s1=new String("Java");
//		String s2=new String("Java");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
//	}
//		double num=20.45678;
//		System.out.printf("%.3f",num);
		
//		String s="Kodnest";
//		s=s.concat("tech");
//		System.out.println(s);
		
		//indise string pool
		String s1="java";
		String s2="Python";
		//outside string pool
		String s3=s1+s2;
		String s4="javaPython";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		
		//outside string pool
		String s5=s1.concat(s2);
		System.out.println(s5==s4);
		
		//outside string pool
		String s6=s1+"Python";
		System.out.println(s4==s6);
		
		//outside string pool
		String s8="java".concat(s2);
		System.out.println(s4==s8);
		
		//inside
		String s9="java"+"Python";
		System.out.println(s4==s9);
		
	}
}
