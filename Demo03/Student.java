package Demo03;

public class Student {
    private int m_Age;
    private String m_Name;
    private String m_Sex;

    public Student(){ }

    public Student(String name, int age, String sex){
        this.m_Age = age;
        this.m_Name = name;
        this.m_Sex = sex;
    }

    public int getM_Age(){
        return this.m_Age;
    }
    public void setM_Age(int age){
        this.m_Age = age;
    }


    public String getM_Name() {
        return this.m_Name;
    }
    public void setM_Name(String name){
        this.m_Name = name;
    }

    public String getM_Sex(){
        return this.m_Sex;
    }
    public void setM_Sex(String sex){
        this.m_Sex = sex;
    }


    public void Show(){
        System.out.println("姓名："+this.m_Name+" 年龄："+this.m_Age+" 性别："+this.m_Sex);
    }

}
