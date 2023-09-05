package Arrays;

import java.util.Scanner;

public class SortedOrNot {
	
	public static boolean arraySorted(int a[]) {
		boolean b=true;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					b=false;
					break;
				}
			}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean res=arraySorted(arr);
		if(res==true) {
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}

}
