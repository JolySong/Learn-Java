package DateFormat.CountPersonBronDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
使用日期时间相关的API，计算一个人已经出生了多少天。
思路:
1.获取当前时间的对应值
2.输入出生生日对应的毫秒值
3.两个时间相减(当前时间-出生日期)
*/
public class Main {
    public static void main(String[] args) throws ParseException {
        long now = GetNowDate();
        long bron = GetBronDate();
        long difference = now-bron;

        //把毫秒值转换为天
        System.out.println("你已经出生了 "+difference/1000/60/60/24+" 天");
    }

    public static long GetNowDate(){
        //匿名对象获取当前时间
        return  new Date().getTime();
    }

    public static long GetBronDate() throws ParseException {

        //获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.printf("请按照格式输入你的出生日期(\"如：2020-12-12\"): ");
        String BirthdayString = sc.next();

        //使用DateFormat类中的parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date Birthday = sdf.parse(BirthdayString);

        //把Date格式的出生日期转换为毫秒值返回
        return Birthday.getTime();
    }

}
