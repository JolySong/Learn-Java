package test.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjInPutStr {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/test/ObjectOutputStream/a.txt"));

        Object obj = ois.readObject();

        System.out.println(obj);

        ois.close();

    }
}
