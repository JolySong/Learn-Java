package Demo04;

import java.util.Scanner;

//三个数的最大值
public class ScanfMax {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int a,b,c;
        System.out.print("Please enter a: ");
        a = scanf.nextInt();

        System.out.print("Please enter b: ");
        b = scanf.nextInt();

        System.out.print("Please enter c: ");
        c = scanf.nextInt();

        System.out.print("a b c MAX is : "+Max(a,b,c));

    }

    public static int Max(int a, int b, int c){
        return a > (b>c?b:c) ? a : (b>c?b:c);
    }
}
