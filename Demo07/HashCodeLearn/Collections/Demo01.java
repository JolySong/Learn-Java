package HashCodeLearn.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
        -java.utils.Collections是集合工具类，用来对集合进行操作
            -public static <T> boolean addAll(Collection(T) c,T...elements);往集合中添加多个元素
            -public static void shuffle(list<?> list); 打乱集合元素中的顺序
            -public
*/
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //向集合中添加多个元素
        Collections.addAll(list,23,12,55,33);
        System.out.println(list);

        //打乱集合中的顺序
        Collections.shuffle(list);
        System.out.println(list);

        //默认升序排列
        Collections.sort(list);
        System.out.println(list);

        //对自定义类不能直接排序，必须实现Comparable，重写compareTo定义排序方法
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("aa",19);
        Person p2 = new Person("cc",22);
        Person p3 = new Person("bb",17);

        Collections.addAll(people,p1,p2,p3);
        System.out.println(people);

        //Collections.sort(people); 不能直接排序,需重写Comparable接口的campareTo方法
        Collections.sort(people);
        System.out.println(people);

    }
}
