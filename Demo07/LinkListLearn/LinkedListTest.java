package LinkListLearn;

import java.util.LinkedList;

public class LinkedListTest {
    /*
    java.util.linkedlist集合 implements list接口


     */
    public static void main(String[] args) {

        test01();

    }

    private static void test01() {
        LinkedList<Integer> list = new LinkedList<>();
        //往集合中插入元素
        list.push(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println(list);

        //往集合中删除元素，默认删除第0个
        list.remove();
        System.out.println(list);
        //弹出第一个元素
        list.pop();
        System.out.println(list);
        //删除第四个元素
        list.remove(2);
        System.out.println(list);

        //获取第一个元素
        System.out.println(list.getFirst());
        //获取最后一个元素
        System.out.println(list.getLast());

        list.add(10);

        //移除并返回此列表第一个元素
        int a =  list.removeFirst();
        System.out.println(a);
        //移除并返回此列表最后一个元素
        a =  list.removeLast();
        System.out.println(a);

        //清空链表
        list.clear();
    }
}
