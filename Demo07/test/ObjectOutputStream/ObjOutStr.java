package test.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    对象的序列化
 */
public class ObjOutStr {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/test/ObjectOutputStream/a.txt"));

        oos.writeObject(new Person("张三",18));
        oos.writeObject(new Person("李四",19));
        oos.writeObject(new Person("王五",12));

        oos.close();
    }
}
