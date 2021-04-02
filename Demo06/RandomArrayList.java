package Demo06;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {
    public static void main(String[] args) {
        //生成6个随机数存放在list并遍历打印
        //test01();

        //自定义4个学生对象添加到集合中并遍历打印
        test02();
    }

    public static void test01(){
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //创建随机数对象
        Random r = new Random();

        //添加
        for (int i=0; i<6; i++){
            list.add( r.nextInt(33)+1 );
        }

        //遍历
        for (int i=0; i<list.size(); i++){
            System.out.println( list.get(i)+" " );
        }
    }
    public static void test02(){

        //创建集合
        ArrayList<Person> list = new ArrayList<>();

        //创建学生对象
        Person student1 = new Person(18,"张三","Man");
        Person student2 = new Person(22,"李四","Woman");
        Person student3 = new Person(19,"王五","Man");
        Person student4 = new Person(21,"赵六","Woman");

        //添加到集合
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        //遍历集合
        for(int i=0; i<list.size(); i++){
            list.get(i).Show();
        }

    }

}
