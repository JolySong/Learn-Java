package SetLearn;

import java.util.HashSet;

/*
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，也没有带索引的方法，也不能使用普通的for循环遍历
        3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结果(查询速度非常快)
 */
public class Demo01 {
    public static void main(String[] args) {
        HashSet<Integer>ha = new HashSet<>();

        ha.add(10);
        ha.add(20);
        ha.add(30);
        ha.add(10);

        ha.remove(10);


        for (Integer integer : ha) {
            System.out.println(integer);
        }
    }
}
