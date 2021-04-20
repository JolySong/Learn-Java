package Calendar;

import java.lang.ref.Cleaner;
import java.util.Calendar;
/*
    java.util.Calendar类：日历
    Cnalendar类是一个抽象类,里边提供了很多操作日历字段的方法（YEAR,MONTH,DAY_OF_MONTH,HOUR）
    canlendar类无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法返回了Canlendar类的子类对象
    static Calendar getOnstance() 使用默认时区和语言环境获得一个日历.
    常用：
    public int get(int field) :返回给定日历段的值。
    public void set(int field, int value) :将给定的日历字段设置为给定值.
    public abstract void add(int field, int amount) :根据日历的规则，添加或删除给指定的时间量。
    public Date getTime() :返回一个便是此Calendar时间值的Data对象.
 */
public class Demo01 {
    public static void main(String[] args) {
       Get();
       Set();
    }

    public static void Get(){
        Calendar c = Calendar.getInstance();//多态

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        System.out.println(year+"年"+(month+1)+"月"+day+"日");

    }

    public static void Set(){
        Calendar c = Calendar.getInstance();//多态

        //设置年2020
        c.set(Calendar.YEAR,2020);
        //设置月份为10
        c.set(Calendar.MONTH,10);
        //设置日为 1
        c.set(Calendar.DATE,1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+day+"日");


        //可以同时设置三个参数
        c.set(2020,0,1);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DATE);

        System.out.println(year+"年"+(month+1)+"月"+day+"日");

    }

}
