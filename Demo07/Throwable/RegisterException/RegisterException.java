package Throwable.RegisterException;

/*
自定义异常类：
        java提供的异常类不够我们使用，需要自定义异常类
 格式：
    public class XXXException extends Exception || RuntimeException
        添加一个空参数的构造方法
        添加一个带异常信息的构造方法

 注意：
        1.自定义异常类一般都是Exception结尾，说明是一个异常类
        2.自定义异常类，必须继承Exception || RuntimeException

 */
public class RegisterException extends Exception{

    public RegisterException(){
        super();
    }
    public RegisterException(String s){
        super(s);
    }
}
