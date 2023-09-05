package Strings;
import java.util.*;

public class LexicographicalSubarray {
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        String small="";
	        String large="";
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        int k=sc.nextInt();
//	        int n=s.length()-2;
	        char ch[]=s.toCharArray();
	        for(int i=0;i<ch.length;i++) {
	        	String sub="";
	        	
	        }
	        
	        String arr[]=new String[s.length()-2];
	        
	        for(int i=0;i<arr.length;i++){
	        	for(int x=0;x<ch.length-k;x++) {
	        		String s1="";
	        		for(int j=x;j<k;j++){
	        			s1+=ch[j];
	        		}
	        	}
	        	
	        }
	        // String arr[]=s.split(s.subarray(0,k));
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        Arrays.sort(arr);
	        small=arr[0];
	        large=arr[arr.length-1];
	        System.out.println(small);
	        System.out.println(large);
	}

}
