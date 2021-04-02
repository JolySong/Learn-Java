package Demo02;

/*

定义一个类，用来模拟"学生"事物，两部分组成
属性
    姓名
    年龄
    性别
行为
    吃饭
    睡觉
    学习
对应到java到类当中：
    成员变量（属性）：
        String m_Name;
        String m_Sex;
        int m_Age;

    成员方法（行为）：
        public void eat(){} 吃饭
        public void sleep(){} 睡觉
        public void learn(){} 学习

【注意事项】：
1.成员变量是直接定义在类当中到，在方法外边。
2.成员方法不要写static关键字。
*/

public class Student {
    //成员变量
    String m_Name;
    String m_Sex;
    int m_Age;

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void learn(){
        System.out.println("学习");
    }

    public void print(){
        System.out.print(m_Name+" ");
        System.out.print(m_Age+" ");
        System.out.println(m_Sex);
    }

    //构造函数
    Student(String name, int age, String sex){
        m_Name = name;
        m_Age = age;
        m_Sex = sex;
    }


}
