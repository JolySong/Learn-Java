package Demo02;

public class MethodOverloadSame {
    public static void main(String[] args) {
        int a = 20,b = 20;
        double c = 10.0,d = 12.0;
        short e = 20,f = 20;
        Long g = 20L,h = 20L;

        if(IsSame(g,h)){
            System.out.println("相等！");
        }else{
            System.out.println("不相等！");
        }
    }
    public static boolean IsSame(int a,int b){
        return a==b;
    }
    public static boolean IsSame(short a,short b){
        return a==b;
    }
    public static boolean IsSame(Long a,Long b){
        return a==b;
    }
    public static boolean IsSame(double a,double b){
        return a==b;
    }
}
