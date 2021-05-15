package test;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSystem {
    public static int No = 0;
    public static ArrayList<Person> JavaEngineer = new ArrayList<>();
    public static void main(String[] args) {

        while(true){
            Select(Menu());
        }


    }

    public static void CountSalary() {
        System.out.print("请输入Java工程师底薪: ");
        Scanner sc = new Scanner(System.in);
        int BasicSalary = sc.nextInt();
        System.out.print("请输入Java工程师月工作完成分数(Min:0  Max:150): ");
        int Score = sc.nextInt();
        System.out.print("请输入Java工程师月实际工作天数: ");
        float Day = sc.nextFloat();
        System.out.print("请输入Java工程师月应扣保险数: ");
        float safe = sc.nextFloat();

        double Salary = BasicSalary+BasicSalary*0.25 * Score * 0.01+ 15*Day - safe;
        System.out.println("Java工程师月薪为: " + Salary);

    }



    public static int Menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("|	    蓝桥计划Java工程师管理系统	   	  |");
        System.out.println("--------------------------------------------------");
        System.out.println("1.输入Java工程师资料");
        System.out.println("2.删除指定Java工程师资料");
        System.out.println("3.查询Java工程师资料");
        System.out.println("4.修改Java工程师资料");
        System.out.println("5.计算Java工程师月薪");
        System.out.println("6.保存新添加Java工程师资料");
        System.out.println("7.对所有Java工程师信息排序(1编号排序，2姓名排序)");
        System.out.println("8.输出所有Java工程师资料");
        System.out.println("9.清空所有Java工程师资料");
        System.out.println("10.打印Java工程师数据报表");
        System.out.println("11.从文件重新导入Java工程师数据");
        System.out.println("0.结束(编辑工程师信息后提示保存)");
        System.out.print("请输入你的选择: ");
        return input.nextInt();
    }

    public static void Select(int x) {
        switch (x) {
            case 1:
                System.out.println("请现在输入Java工程师资料...");
                InputEngInf();
                break;
            case 2:
                System.out.println("正删除Java工程师资料...");
                deleteEngInf();
                break;
            case 3:
                System.out.println("正查询Java工程师资料...");
                searchEngInf();
                break;
            case 4:
                System.out.println("正修改Java工程师资料...");
                modifyEngInf();
                break;
            case 5:
                System.out.println("正计算Java工程师月薪...");
                CountSalary();
                break;
            case 6:
                System.out.println(" 本模块功能未实现");
                break;
            case 7:
                System.out.println(" 本模块功能未实现");
                break;
            case 8:
                System.out.println("正输出所有Java工程师资料");
                printAllEngInf();
                break;
            case 9:
                System.out.println(" 本模块功能未实现");
                break;
            case 10:
                System.out.println(" 本模块功能未实现");
                break;
            case 11:
                System.out.println(" 本模块功能未实现");
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
    }
    public static boolean searchEngInf(){
        System.out.print("Please enter engineer number: ");
        int index = new Scanner(System.in).nextInt();
        if(JavaEngineer.size()>=0 && JavaEngineer.size()<=index) {
            System.out.println(JavaEngineer.get(index-1));
            return true;
        }else{
            System.out.println("No found it!");
            return false;
        }

    }
    public static void InputEngInf(){

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Please enter Name: ");
            String name = sc.next();
            System.out.printf("Please enter Sex(1.Man  2.Woman): ");
            int sex = sc.nextInt();
            System.out.printf("Please enter Eduction(1.大专 2.本科 3.硕士 4.博士 5.其它): ");
            int edu = sc.nextInt();

            if ((sex >= 1 && sex <= 2) || (edu >= 1 && edu <= 5)) {
                JavaEngineer.add(new Person(name,sex,edu,No++));
                System.out.println("成功添加!");
                break;
            }
            System.out.println("输入错误，请重新输入");
        }
    }

    public static void modifyEngInf() {
    }

    public static void deleteEngInf() {
        System.out.printf("Please enter you need Delect engineer index: ");
        int index = new Scanner(System.in).nextInt();
        if(JavaEngineer.size()>=0 && JavaEngineer.size()<=index) {
            JavaEngineer.remove(index-1);
        }else{
            System.out.println("Index out of bounds!");
        }
    }
    public static void printAllEngInf() {
        for(Person p : JavaEngineer){
            System.out.println(p);
        }
    }

}
