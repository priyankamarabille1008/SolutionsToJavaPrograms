package Arrays;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[][]=new int[N][M];
		int B[][]=new int[M][N];
		int c[][]=new int[N][M];
		
		
	for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				A[i][j]=sc.nextInt();
			}
		}
	c=A;
	A=B;
	B=c;
//		for(int i=0;i<M;i++) {
//			for(int j=0;j<N;j++) {
//				B[i][j]=A[j][i];
//			}
//		}
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}

}
