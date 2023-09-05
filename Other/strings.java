package Other;
class strings{
    public static void main(String[] args){
     StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int f=i;
            int b=sb.length()-i-1;
            char fc=sb.charAt(f);
            char bc=sb.charAt(b);

            sb.setCharAt(f, bc);
            sb.setCharAt(b, fc);
        }
        System.out.println(sb);
    }
}