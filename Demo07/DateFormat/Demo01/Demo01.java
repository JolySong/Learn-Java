package DateFormat.Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat: 日期/时间格式化子类的抽象类
    作用:
        格式化（日期-->文本） 解析(文本-->日期)
    成员方法:
        String format(Date date)  按照指定的模式，将Data日期格式化为符合模式的字符串
        Data parse(String source) 把符合模式的字符串，解析为Data日期
    DataFormat类是一个抽象类，无法直接创建对象使用，可以使用DataFormat的子类；

Java.text.SimpleDateFormat(String pattern) 用给的的模式和默认语言环境的日期格式符合构建SimpleDateFormat
    参数：
        String pattern:传递指定的模式
    模式: 区分大小写
        y 年
        M 月
        d 日
        H 时
        m 分
        s 秒
    写对应的模式，会把模式替换成相应的日期和时间
        "yyyy-MM-dd HH:mm:ss"
        "yyyy年MM月dd日 HH时mm分ss秒"

 */
public class Demo01 {
    public static void main(String[] args) throws ParseException {
/*
    使用DateFormat类中的发放format，把日期格式化为文本
    String format(Date date)  按照指定的模式，将Data日期格式化为符合模式的字符串

     使用步骤：
            1.创建SimpleDateFormat对象，构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式将Data日期格式化为符合模式的字符串
*/
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(text);

        //2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式将Data日期格式化为符合模式
        date = sdf.parse(text);
        System.out.println(date);


    }


}
