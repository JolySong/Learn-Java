package Recurrsion;

import java.util.Scanner;

/*
    递归的测试案例
 */
public class Demo01 {
    public static void main(String[] args) {
        // 递归计算1-n之间的和
        //show01();

        //递归计算阶乘
        show02();
    }

    private static void show02() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter num: ");
        int x = sc.nextInt();

        System.out.println(f(x));
    }

    public static int f(int x){
        if(x==1){
            return 1;
        }
        return x*f(x-1);
    }

    private static void show01() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter num: ");
        int a = sc.nextInt();

        System.out.println(Sum(a));

    }

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n+Sum(n-1);
    }

}
