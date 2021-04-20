package Throwable.RegisterException;

import tostringANDequals.Person;

import java.awt.font.ShapeGraphicAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/*
 需求 注册界面校验注册用户名是否存在
    存在就抛出异常RegisterException

 */
public class TestRegisterException{
    //存放用户名的数组
    static ArrayList<String>list = new ArrayList<>();

    public static void main(String[] args) throws RegisterException {
        //初始化数据库
        InitList();

        //获取用户输入的用户名
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入注册的用户名: ");
        String Username = sc.next();

        //校验用户名是否存在 存在抛出异常，不存在添加用户
        CheckUsername(Username);

        //打印用户名
        PrintUsername();

    }
    public static void InitList(){
        list.add("张三");
        list.add("李四");
        list.add("王五");
    }
    public static void PrintUsername(){
        for (String name : list) {
            System.out.print(name+" ");
        }
        System.out.println();
    }

    public static void CheckUsername(String Username) throws RegisterException {

        //遍历数据库
        for(String name:list){
            //如果存在抛出异常
            if (name.equals(Username)){
                throw new RegisterException("用户名已存在！");
            }
        }
        list.add(Username);
        System.out.println("注册成功！");
    }
}
