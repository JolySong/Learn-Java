package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEx14 {
    public static void main(String[] args) {
        try {
            int appleNum = 0;
            int stuNum = 0;
            System.out.println("***现在给孩子们分苹果***");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入桌子上有几个苹果: ");
            appleNum = sc.nextInt();
            System.out.print("请输入班上有几个学生: ");
            stuNum = sc.nextInt();
            System.out.println("班上每个孩子分得多少苹果: "+appleNum/stuNum);
            System.out.println("孩子们很开心！");
        }catch (ArithmeticException e){
            System.out.println("算术异常"+e);
        }catch (InputMismatchException e){
            System.out.println("输入不匹配异常"+e);
        }
        System.out.println("程序执行完毕");
    }
}
