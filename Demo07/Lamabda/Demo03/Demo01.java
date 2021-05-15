package Lamabda.Demo03;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo01 {

    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("张三",18));
        p.add(new Person("李四",20));
        p.add(new Person("王五",19));

        for(Person s:p){
            System.out.println(s.getM_Name()+"  "+s.getM_Age());
        }

        p.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getM_Age()-o2.getM_Age();
            }
        });

        //Lambda表达式
        //p.sort((Person o1,Person o2)-> {
        //    return o2.getM_Age()-o1.getM_Age();
        //});

        //Lambda表达式优化写法
        p.sort((o1,o2)-> o2.getM_Age()-o1.getM_Age());

        for(Person s:p){
            System.out.println(s.getM_Name()+"  "+s.getM_Age());
        }
    }
}
