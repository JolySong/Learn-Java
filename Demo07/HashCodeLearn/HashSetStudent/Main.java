package HashCodeLearn.HashSetStudent;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一：
        存储的元素(String,Integer,...Studnet,Person...),必须重写hashCode方法和equals方法

     要求：
        同名同年龄视为同一人，只存储一次

 */
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("张三",19);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("张三",19);

        HashSet<Student> student = new HashSet<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);

        for (Student student1 : student) {
            System.out.println(student1);
        }

    }
}
