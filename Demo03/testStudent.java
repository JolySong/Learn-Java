package Demo03;
import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {
        //System.in代表获取键盘输入
        Scanner scanf = new Scanner(System.in);
        int age;
        String name,sex;
        System.out.print("请输入名字: ");
        name = scanf.next();
        System.out.print("请输入年龄: ");
        age = scanf.nextInt();
        System.out.print("请输入性别: ");
        sex = scanf.next();
        Student stu = new Student(name,age,sex);
        stu.Show();

    }
}
