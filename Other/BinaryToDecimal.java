package Other;
public class BinaryToDecimal {
 public static void convertBinaryToDecimal(String binary) {
	 int n=binary.length();
	 char arr=new binary.toCharArray()[n];
	 int j=n;
	 int res=0;
	 while(j>=1) {
		 for(int i=0;i<n;i++) {
			 res+=arr[i]*(2^j);
			 System.out.println(res);
			 j--;
		 }
	 }
	 int last=binary.charAt(n-1);
	 System.out.println(res+last);
 }
 public static void main(String[] args) {
 convertBinaryToDecimal("1011");
 }
}