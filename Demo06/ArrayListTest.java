package Demo06;

import java.util.ArrayList;

/*
ArrayList 中常用的方法：
public boolean add(E e); 添加元素，返回值布尔型
public E get(int index); 获取元素，参数是索引编号，ArrayList的index从0开始
public E remove(int index); 删除元素，参数是索引编号
public int size(); 获取长度，返回值是集合中的元素个数
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        //获取元素
        System.out.println(list.get(1));

        //删除元素
        System.out.println("被删除的是: "+ list.remove(1));
        System.out.println(list);

        //获取长度
        System.out.println(list.size());
    }
}
