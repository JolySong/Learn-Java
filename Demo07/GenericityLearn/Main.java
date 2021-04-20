package GenericityLearn;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //创建泛型类
        //CreatGenericity();

        TongPeiFu();
    }

    public static void CreatGenericity(){
        //方法一：创建实现类的时候确定泛型
        GenericityInterface impl1 = new GenericityInterfaceImpl1();
        impl1.mythod("Hello");

        //方法二：创建对象的时候确定泛型
        GenericityInterface<Integer> impl2 = new GenericityInterfaceImpl2();
        impl2.mythod(19);

        GenericityInterface<Double> impl3 = new GenericityInterfaceImpl2();
        impl3.mythod(1.1);
    }

    public static void TongPeiFu(){
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<String>list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Java");
        list2.add("World");

        printArray(list1);
        printArray(list2);

    }
    /*
        定义一个方法，能遍历所有类型的Arraylist集合
        不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符？来接受数据类型
     */
    public static void printArray(ArrayList<?> list){

        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
