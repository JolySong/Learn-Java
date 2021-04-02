package Demo02;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("MAX = "+Max(a,b));
    }
    public static int Max(int a,int b){
        return a>b?a:b;
    }

}
