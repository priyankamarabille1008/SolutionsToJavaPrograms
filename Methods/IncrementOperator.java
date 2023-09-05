package Methods;
public class IncrementOperator {
    public static void main(String[] args){
        int x=10;
        int y=x++ + x++ + ++x + x + x++ ;
        System.out.println("x= "+x);
        System.out.println("y= "+y);

        int a=5;
        int b=a + a++ + ++a + ++a + ++a + a++ + a + a++;
        System.out.println(a);
        System.out.println(b);

        int p=10;
        int q=--p + p-- + --p + --p + --p + p++;
        System.out.println(p);
        System.out.println(q);

    }
}
