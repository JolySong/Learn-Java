package test;

import java.util.Objects;

public class Person {

    private int engNo = -1;
    private String engName = "";
    private int engSex = -1;    //性别(1.Man  2.Woman)
    private int engEdu = -1;    //教育程度(1.大专 2.本科 3.硕士 4.博士 5.其它)

    private int basSalary = 3000;       //底薪 不能为负数
    private double insurance = basSalary*0.105; //应扣保险数

    //以下属性为Java工程师月工作情况，计算工资时候填写
    private int comResult = 100;

    public  Person(String name, int sex, int edu, int index){
        this.engSex = sex;
        this.engName = name;
        this.engEdu = edu;
        this.engNo = index;
        ++engNo;
    }
    @Override
    public String toString() {

        String Sex;
        String Edu;
        if (this.engSex == 1){
            Sex = "男";
        }else Sex = "女";
        switch (this.engEdu){
            case 1: Edu = "大专";break;
            case 2: Edu = "本科";break;
            case 3: Edu = "硕士";break;
            case 4: Edu = "博士";break;
            default:
                Edu = "其它";break;
        }
        return "编号: "+this.engNo+"\t姓名: "+this.engName+"\t性别: "+Sex+"\t教育程度: "+Edu+" ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return engNo == person.engNo && engSex == person.engSex && engEdu == person.engEdu && basSalary == person.basSalary && Double.compare(person.insurance, insurance) == 0 && comResult == person.comResult && Double.compare(person.workDay, workDay) == 0 && Double.compare(person.endSalary, endSalary) == 0 && Objects.equals(engName, person.engName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engNo, engName, engSex, engEdu, basSalary, insurance, comResult, workDay, endSalary);
    }

    public int getBasSalary() {
        return basSalary;
    }

    public void setBasSalary(int basSalary) {
        this.basSalary = basSalary;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public int getComResult() {
        return comResult;
    }

    public void setComResult(int comResult) {
        this.comResult = comResult;
    }

    public double getWorkDay() {
        return workDay;
    }

    public void setWorkDay(double workDay) {
        this.workDay = workDay;
    }

    public double getEndSalary() {
        return endSalary;
    }

    public void setEndSalary(double endSalary) {
        this.endSalary = endSalary;
    }

    private double workDay = 22;
    private double endSalary = 0.0;

    public int getEngNo() {
        return engNo;
    }

    public void setEngNo(int engNo) {
        this.engNo = engNo;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getEngSex() {
        return engSex;
    }

    public void setEngSex(int engSex) {
        this.engSex = engSex;
    }

    public int getEngEdu() {
        return engEdu;
    }

    public void setEngEdu(int engEdu) {
        this.engEdu = engEdu;
    }
}
