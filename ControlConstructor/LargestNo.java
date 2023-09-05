package ControlConstructor;
public class LargestNo {
    static void findLargestDigit(int n){
        int largedigit=-1;
        while(n>0){
            int digit=n%10;
            if(digit>largedigit){
                largedigit=digit;
            }
            n=n/10;
        }
        System.out.print(largedigit);
    }
    public static void main(String[] args) {
        int n=12349078;
        findLargestDigit(n);
       }
}
