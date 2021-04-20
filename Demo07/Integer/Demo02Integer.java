package Integer;

import java.util.ArrayList;

/*
自动装箱和自动拆箱：
        基本类型的数据和包装类之间可以自动的相互转换
        JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        自动装箱：之间把int类型的整数复制给包装类
        Integer in = 1; 就相当于Integer in = new Integer(1);
        */

        Integer in = 1;

        /*
        自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型的数据类型，再参与计算
        in + 2; 相等于in.intValue() + 3 = 3;
        in = in + 2; 相当于 in = new Integer(3);
        */

        in += 2;
        System.out.println(in);

        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);    //自动装箱

        int a = list.get(0);    //自动拆箱

        System.out.println(list.get(0).intValue());  //手动拆箱

        System.out.println(a);
    }
}
