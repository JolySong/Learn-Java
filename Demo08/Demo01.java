
import java.util.Scanner;

public class Demo01{
	public static void main(String[] args){


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
		int in = input.nextInt();
		System.out.println("你的选择是: "+in);

		switch (in){
			case 1:
				System.out.print(" 本模块功能未实现");
				break;
			case 2:
				System.out.print(" 本模块功能未实现");
				break;
			case 3:
				System.out.print(" 本模块功能未实现");
				break;
			case 4:
				System.out.print(" 本模块功能未实现");
				break;
			case 5:
				CountSalary();
				break;
			case 6:
				System.out.print(" 本模块功能未实现");
				break;
			case 7:
				System.out.print(" 本模块功能未实现");
				break;
			case 8:
				System.out.print(" 本模块功能未实现");
				break;
			case 9:
				System.out.print(" 本模块功能未实现");
				break;
			case 10:
				System.out.print(" 本模块功能未实现");
				break;
			case 11:
				System.out.print(" 本模块功能未实现");
				break;
			case 0:
				System.exit(0);
			default:
				break;
		}
	}

	public static void CountSalary(){
		System.out.print("请输入Java工程师底薪: ");
		Scanner sc = new Scanner(System.in);
		int BasicSalary = sc.nextInt();
		System.out.print("请输入Java工程师月工作完成分数(Min:0  Max:150): ");
		int Score = sc.nextInt();
		System.out.print("请输入Java工程师月实际工作天数: ");
		float Day = sc.nextFloat();
		System.out.print("请输入Java工程师月应扣保险数: ");
		float safe = sc.nextFloat();

		double Salary = BasicSalary*Score*0.01-safe;
		System.out.println("Java工程师月薪为: "+Salary);

	}

	public static void Menu(){
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
		int in = input.nextInt();
		System.out.println("你的选择是: "+in);
	}
}
