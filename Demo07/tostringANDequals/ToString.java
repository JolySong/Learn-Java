package tostringANDequals;

import java.util.Random;

/*
所有对象默认继承超类Object
Object obj
 */
public class ToString {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",20);

        //如类未重写tostring方法 会打印地址值
        System.out.println(p1);

        //equals 未重写会默认比较两个对象地址是否相等
        Person p3 = new Person("李四",20);
        System.out.println(p2.equals(p3));

        //如果使用其它类比较会发生错误，需要增加equals判断类是否能够转换
        Random r = new Random();
        boolean b = p1.equals(r);
        System.out.println(b);

        //如果传入的比较对象是null
        b = p1.equals(null);
        System.out.println(b);

        //传入的比较对象是自身
        b = p1.equals(p1);
        System.out.println(b);

    }
}
