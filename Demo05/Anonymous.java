package Demo05;

import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {

        //匿名对象的方式（只能使用一次）
//        System.out.print("Please enter a number: ");
//        int input = new Scanner(System.in).nextInt();
//        System.out.print("Input = "+input);

        //匿名对象传参数
        methodParam(new Scanner(System.in));
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("Input is "+num);
    }
}
