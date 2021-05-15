package test.QueueImpl;

public interface Queue {
    //入队
    public void EnQueue(Object obj) throws Exception;

    //出队
    public Object DeQueue() throws Exception;

    //获取队首元素
    public Object QueueFount() throws Exception;

    //判断队列是否为空
    public boolean notEmpty();
}
