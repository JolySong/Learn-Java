package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    boolean add(E e);       添加元素
    boolean remove(E e);    删除元素
    void clear();           清空集合
    boolean contains(E e);  是否包含
    boolean isEmpty();      是否为空
    int size();             集合长度
    Object[] toArray();     转成数组

 */
public class Arrlist {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

//        boolean add(E e);       添加元素
        coll.add("Hello");
        coll.add("World");
        coll.add("Hello");
        coll.add("Java");
        System.out.println(coll);

//        boolean remove(E e);    删除元素
        boolean b = coll.remove("Hello");
        System.out.println(b);
        System.out.println(coll);

//        void clear();           清空集合
        coll.clear();
        System.out.println(coll);

//        boolean contains(E e);  是否包含
        coll.add("Hello");
        coll.add("World");
        System.out.println(coll);
        b = coll.contains("Hello");
        System.out.println(b);

//        boolean isEmpty();      是否为空
        b = coll.isEmpty();
        System.out.println(b);

//        int size();             集合长度
        System.out.println(coll.size());

//        Object[] toArray();     转成数组
        Object[] Arr = coll.toArray();
        System.out.println(coll);
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(Arr[i]);
        }

    }
}
