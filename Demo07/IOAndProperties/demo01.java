package IOAndProperties;

import java.io.*;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;

public class demo01 {
    public static void main(String[] args) throws IOException {
        //如何使用Properties 添加数据，遍历数据
        show01();

        //如何使用 store 把临时数据持续化写入硬盘
        show02();

        //如何使用 load 把临时数据持续化写入硬盘
        show03();


    }

    private static void show03() throws IOException {
        /*
             void load(InputStream inStream)
             void load(Reader reader)
             参数：
                 InputStream inStream: 字节输入流，不能读含有中文的键值对
                 Reader reader: 字符输入流，可以读含有中文的键值对
             使用步骤：
                    1.创建Properties集合对象
                    2.使用Properties集合中的方法load方法，读取保存键值对的文件
                    3.遍历Properties集合

        */

        // 1.创建Properties集合对象
        Properties prop = new Properties();

        //2.使用Properties集合中的方法load方法，读取保存键值对的文件
        prop.load(new FileReader("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/IOAndProperties/a.txt"));

        //3.遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }



    }

    private static void show02() {
        /*
            void store(OutputStream Out, String comments)
            void store(Writer writer, String comments)
            参数：
                Outputstream Out: 字节输出流，不能写中文
                Writer writer: 可以写中文
                String Comments: 注释，不能使用中文，unicode编码，一般使用空字符串

            使用步骤：
                    1.创建Properties集合对象，添加数据
                    2.创建字节/字符输出流对象，构造方法中添加绑定的路径
                    3.使用Properties集合中的方法store方法，把集合中的临时数据持续化写入到硬盘中存储
                    4.释放资源
         */

        //1.创建Properties集合对象，添加数据
        Properties prop = new Properties();
        prop.setProperty("AAA","111");
        prop.setProperty("BBB","222");
        prop.setProperty("CCC","333");
        prop.setProperty("DDD","444");


        FileWriter fw = null;
        try{
            //2.创建字节/字符输出流对象，构造方法中添加绑定的路径
            fw = new FileWriter("/Users/song/Desktop/Learn/Java/Learn-2/src/advance/src/IOAndProperties/a.txt");

            //3.使用Properties集合中的方法store方法，把集合中的临时数据持续化写入到硬盘中存储
            prop.store(fw,"Sava data");
        }catch(IOException e){
            System.out.println(e);
        }finally {
            if(fw != null){
                try{
                    //4.释放资源
                    fw.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }

        }

    }

    private static void show01() {
        //1.创建集合对象
        Properties prop = new Properties();

        //2.往集合中添加数据
        prop.setProperty("AAA","111");
        prop.setProperty("BBB","222");
        prop.setProperty("CCC","333");
        prop.setProperty("DDD","444");

        //3.使用stringPropertyNames把Properties集合中的 键(Key) 取出放在set集合中
        Set<String> set = prop.stringPropertyNames();

        //4.遍历set集合，根据 键(Key) 找到 值(value)
        for (String key : set) {
            //使用getProperty获取value
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
