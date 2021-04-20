package Integer;
/*
    装箱：把基本数据类型包装到包装类中（基本数据类型-->包装类）
        构造方法:
            Integer(int value) 构造一个新分配到Integer对象，它表示指定到int值
            Integer(String s)  构造一个新分配到Integer对象，它表示String参数所指示到 int值
                                 传递到字符串必须是基本类型到字符串，否则抛出异常"100"正确 "a"异常
            静态方法：
                static Integer valueOf(int i)返回一个表示指定的int值的Integer实例。
                static Integer valueOf(String s)返回保存指定的String的值的Integer对象。

    拆箱：把包装类中到基本数据类型取出来（包装类-->基本数据类型）
        成员方法:
                int intValue()： 以int类型返回该Integer的值。


 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱：把基本数据类型包装到包装类中（基本数据类型-->包装类）
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("97");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        //Integer in4 = Integer.valueOf("a");  //异常NumberFormatException
        Integer in4 = Integer.valueOf("65");
        System.out.println(in4);

        //拆箱：把包装类中到基本数据类型取出来（包装类-->基本数据类型）
        int i = in1.intValue();
        System.out.println(i);

    }
}
