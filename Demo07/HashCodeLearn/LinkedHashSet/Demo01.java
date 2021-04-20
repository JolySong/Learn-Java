package HashCodeLearn.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    LinkedHashSet集合特点：
            底层是一个哈希表（数组+链表/红黑树）+链表：（多了一条链表记录元素存储顺序）
 */
public class Demo01 {
    public static void main(String[] args) {

        //存储Integer默认升序
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(11);
        set1.add(5);
        set1.add(3);
        set1.add(2);
        set1.add(9);
        System.out.println(set1);

        //存储其它类型默认无序
        HashSet<String> set2 = new HashSet<>();
        set2.add("Hello");
        set2.add("World");
        set2.add("Hi");
        set2.add("Java");
        System.out.println(set2);

        //linkedHashSet有序
        LinkedHashSet<String>set3 = new LinkedHashSet<>();
        set3.add("Hello");
        set3.add("World");
        set3.add("Hi");
        set3.add("Java");
        System.out.println(set3);
    }
}
