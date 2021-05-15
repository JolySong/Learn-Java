package Lamabda.Demo03;

public class Person {
    private int m_Age;
    private String m_Name;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "m_Age=" + m_Age +
                ", m_Name='" + m_Name + '\'' +
                '}';
    }

    public Person(String m_Name, int m_Age) {
        this.m_Age = m_Age;
        this.m_Name = m_Name;
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
