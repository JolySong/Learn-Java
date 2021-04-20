package tostringANDequals;

import java.util.Objects;

//所有对象默认继承超类Object
public class Person extends Object{
    private String m_Name;
    private int m_Age;

    public Person() {
    }

    public Person(String m_Name, int m_Age) {
        this.m_Name = m_Name;
        this.m_Age = m_Age;
    }

    //重写equals
    @Override
    public boolean equals(Object o) {
        //增加一个判断，如果o是NULL 就不用比较直接return,提高效率
        if(o == null){
            System.out.print("对象是null  无法比较  返回值是: ");
            return false;
        }

        //在增加一个判断，是否跟自身比较，提高效率
        if(this == o){
            System.out.print("这是自己跟自己比较 比较的结果是: ");
            return true;
        }

        //向下转型，对比对象的属性,先判断能不能转
        if(o instanceof Person){
            Person temp = (Person) o;
            System.out.print("传入对象已向下转型 比较的结果是: ");
            return (temp.m_Age == this.m_Age && temp.m_Name == this.m_Name);
        }

        System.out.print("类型不一致，无法向下转型返回值是: ");
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_Name, m_Age);
    }

    //重写toString
    @Override
    public String toString() {
        return "Person{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                '}';
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }
}
