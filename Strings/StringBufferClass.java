package Strings;

public class StringBufferClass {
	public static void main(String[] args) {
//	StringBuffer sb=new StringBuffer();
//	StringBuffer sb=new StringBuffer("java");
	StringBuffer sb=new StringBuffer(10);
	StringBuffer sb1=new StringBuffer("java");
	sb.append("Script object oriented programming language");
	String s=new String();
	s="java";
//	sb="java";
	
	System.out.println(sb.charAt(2));
	System.out.println(sb.indexOf("a"));
	System.out.println(sb.reverse());
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.equals(sb1));
	System.out.println(sb.equals(sb));
	System.out.println(s.substring(3,3));
//	System.out.println(sb==s);
	System.out.println(sb);
	
	int i=500;
	byte b=(byte)i;
	System.out.println(b);
	}
}
