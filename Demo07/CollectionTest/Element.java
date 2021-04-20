package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;

/*
    创建集合对象，使用泛型
        好处：
            1.避免类型转换的麻烦，存储的是什么类型，取出就是什么类型
            2.把运行期异常（代码运行之后抛出异常），提升到了编译器（写代码的时候会报错）
        弊端：
            泛型是什么类型就只能存储什么类型
     test01();

    创建集合对象，不使用泛型
        好处：
            集合不使用范型，默认的类型就是Object类型，可以存储任意类型的数据
        弊端：
            不安全吗，会引发异常
    test02();
*/

public class Element {
    public static void main(String[] args) {
        //程序执行钱，获取一次毫秒值
        long s = System.currentTimeMillis();


        test01();
        //test02();

        //程序执行后，在获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时:" + (e-s) +" 毫秒");
    }

    public static void test01(){
        //创建集合对象，使用泛型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        for(int i:list){
            System.out.println(i);
        }
    }

    public static void test02(){

        //创建集合对象，不使用泛型
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);

        //获取迭代器
        //Iterator it = list.iterator();
        //使用迭代器遍历
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //使用foreach遍历
        for(Object obj:list){
            System.out.println(obj);
        }
    }


}
