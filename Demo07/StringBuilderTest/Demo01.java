package StringBuilderTest;

/*
 java.lang.StringBuilder类: 字符串缓存区，提高字符串的效率
 构造方法：
        -public StringBuilder(); 构造一个空的StringBuilder容器。
        -public StringBuilder(String str); 构造一个StringBuilder容器。

 常用方法:
        -public StringBuilder append(...); 添加任意类型数据的字符串形式，并返回当前对象自身
        -public String toString(); 将当前StringBuilder对象转换成String对象。
*/
public class Demo01 {
    public static void main(String[] args) {
        CreatStringBuilder();
        ApplyStringBuilderOne();
        ApplyStringBuilderTwo();
    }

    //StringBuilder常用使用方法
    public static void ApplyStringBuilderOne() {
        StringBuilder bu1 = new StringBuilder("Hello");
        bu1.append(",World");
        System.out.println(bu1);

    }
    public static void ApplyStringBuilderTwo() {
        StringBuilder bu1 = new StringBuilder("Hello");
        bu1.append(",Java");
        System.out.println(bu1);

        String str = bu1.toString();
        System.out.println(str);
    }

    //StringBuilder构造方法
    public static void CreatStringBuilder(){

        //StringBuilder无参构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1: "+bu1);

        StringBuilder bu2 = new StringBuilder("Hello,World");
        System.out.println("bu2: "+bu2);
    }
}
