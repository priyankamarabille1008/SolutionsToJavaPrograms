package RecursionPrograms;

public class FunTime {
	public static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println("executing fun"+n);
		fun(n-1);
//		n--;
	}
	
	public static void main(String[] args) {
		fun(5);
	}

}
