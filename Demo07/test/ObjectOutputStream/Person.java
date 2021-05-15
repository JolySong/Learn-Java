package test.ObjectOutputStream;

import java.io.Serializable;
import java.util.Objects;

//需要Serializable标记才能序列化对象
public class Person implements Serializable {
    private int m_Age;
    private String m_Name;

    public Person(String m_Name,int m_Age) {
        this.m_Age = m_Age;
        this.m_Name = m_Name;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return m_Age == person.m_Age && Objects.equals(m_Name, person.m_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_Age, m_Name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "m_Age=" + m_Age +
                ", m_Name='" + m_Name + '\'' +
                '}';
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }
}
