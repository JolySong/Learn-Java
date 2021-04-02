package Demo06;

public class Person {
    private int m_Age;
    private String m_Name;
    private String m_Sex;

    public Person(int age, String name, String sex){
        this.m_Age = age;
        this.m_Name = name;
        this.m_Sex = sex;
    }
    public Person(){}

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

    public String getM_Sex() {
        return m_Sex;
    }

    public void setM_Sex(String m_Sex) {
        this.m_Sex = m_Sex;
    }

    public void Show(){
        System.out.println("姓名："+this.getM_Name()+" 年龄："+this.getM_Age()+" 性别："+this.getM_Sex());
    }

}
