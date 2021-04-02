package Demo04;
import java.util.Scanner;

//两个数的和
public class ScanfSum {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int a,b;
        System.out.print("请输入a的值: ");
        a = scanf.nextInt();

        System.out.print("请输入b的值: ");
        b = scanf.nextInt();

        System.out.println("a + b = "+Sum(a,b));
    }

    public static int Sum(int a, int b){
        return a+b;
    }
}
