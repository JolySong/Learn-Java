package Demo02;

/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能够使用（实例化对象）
 1. 导包
    import 包名称.类名称;
    import Demo02.Student;
    对于和当前类属于同一个包的情况，可以省略导包语句不写。

 2. 创建
    类名 对象名 = new 类名();

 3. 使用
    对象名.属性 ｜｜ 对象名.方法
 */
public class StudentCase {
    public static void main(String[] args) {
        //1.导包: 当前类属于同一个包

        //2.创建: 类名 对象名 = new 类名();
        Student stu = new Student("张三",18,"男");

        //3.使用: 对象名.属性 ｜｜ 对象名.方法
        System.out.println(stu.m_Name);
        stu.print();
    }
}
