package HashCodeLearn.Collections;

import java.util.Objects;

//自定义类型进行排序，需重写Comparable接口的compareTo方法
public class Person implements Comparable<Person> {

    //重写排序规则
    @Override
    public int compareTo(Person o) {
        //自定义比较规则
        // this - 参数 :升序
        // 参数 - this :降序
        return this.getAge()-o.getAge();
    }

    private String Name;
    private int Age;

    public Person() {
    }

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Age == person.Age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
