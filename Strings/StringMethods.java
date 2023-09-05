package Strings;

public class StringMethods {
	public static void main(String[] args) {
		String str="java,python";
		String str1="jAVA,PYTHON";
		String c[]=str.split("a");
		for(String ch:c) {
			System.out.println(ch);
		}
		String s1="HTML,ReactJS";
		System.out.println(str.replace('a','A'));
		System.out.println(str.contains("python"));
		System.out.println(str.endsWith("ojj"));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase(s1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.replaceAll(",", s1));
		System.out.println(str.trim());
		
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareTo(str));
		System.out.println(str1.compareTo(str));
	}
}
