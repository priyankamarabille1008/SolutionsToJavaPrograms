package Arrays;
    import java.util.*;
    import java.io.*;


public class hackerrank1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        
        int arr[][]=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solve(arr);
    }
        static void Solve(int arr[][]){
        int total=0;
        int max=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int top=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int md=arr[i+1][j+1];
                int bt=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                total=top+md+bt;
                if(total>max){
                    max=total;
                }
            }
        }
        System.err.println(max);
        }
}




