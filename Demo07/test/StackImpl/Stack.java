package test.StackImpl;

public interface Stack {

    //压栈
    public void push(Object obj) throws Exception;

    //弹栈
    public Object pop() throws Exception;

    //查看栈顶元素
    public Object getTop() throws Exception;

    //判断栈是否为空
    public boolean notEmpty();
}
