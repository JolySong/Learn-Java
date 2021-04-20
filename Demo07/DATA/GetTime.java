package DATA;

import java.util.Date;

/*
DATA类的 默认构造获取当前系统时间

数据类型是 long
 */
public class GetTime {
    public static void main(String[] args) {

        //默认构造获取当前系统时间
        Date time = new Date();
        System.out.println(time); //Tue Apr 06 16:26:57 CST 2021

        //0代表初始时间1970-1-1 00：00：00 由于中国属于东八区 时间+8小时
        time = new Date(0l);
        System.out.println(time); //Thu Jan 01 08:00:00 CST 1970

        //日期转换为毫秒，不写参数默认0
        long num = time.getTime();
        System.out.println(num);

        //获取当前系统时间然后转换为毫秒
        time = new Date();
        num = time.getTime();
        System.out.println(num);
    }
}
