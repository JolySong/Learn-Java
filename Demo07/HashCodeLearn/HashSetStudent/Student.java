package HashCodeLearn.HashSetStudent;

import java.util.Objects;

public class Student {
    private String m_Name;
    private int m_Age;

    public Student(){}

    public Student(String m_name, int m_age) {
        m_Name = m_name;
        m_Age = m_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return m_Age == student.m_Age && Objects.equals(m_Name, student.m_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_Name, m_Age);
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
