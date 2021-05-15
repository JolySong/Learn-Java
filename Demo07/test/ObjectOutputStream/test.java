package test.ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        list.add(new Person("赵六",21));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/test/ObjectOutputStream/test.txt"));
        oos.writeObject(list);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/test/ObjectOutputStream/test.txt"));
        ArrayList<Person> list1 = (ArrayList<Person>) ois.readObject();

        for (Person person : list1) {
            System.out.println(person);
        }

        ois.close();
    }
}
