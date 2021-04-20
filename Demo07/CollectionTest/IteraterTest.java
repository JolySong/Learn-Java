package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java中的迭代器，对集合进行遍历
    两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回true
            判断集合中还有没有下一个元素，有就返回true，没有返回false
        E next() 返回迭代的下一个元素
            去除集合中的下一个元素

      获取迭代器
       Iterater<E> iterater()
       返回在此collection的元素上进行迭代的迭代器

       使用方法：
            1.使用集合中的方法iterater()获取迭代器的实现类对象，使用iterater接口接收（多态）
            2.使用Iterater接口中的方法hasNext判断还有没有下一个元素
            3.使用Iterater接口中的方法next取出集合中的下一个元素
 */
public class IteraterTest {
    public static void main(String[] args) {

        //创建一个集合对象
        Collection<Integer> coll = new ArrayList<>();

        //添加元素
        coll.add(11);
        coll.add(22);
        coll.add(33);
        coll.add(44);
        coll.add(55);

        //获取迭代器
        Iterator<Integer> it = coll.iterator();

        //遍历集合
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //foreach遍历集合
        for (int i:coll) {
            System.out.println(i);
        }



    }
}
