package test.QueueImpl;

public class SeqQueue implements Queue{
    int defaultSize = 10; //默认大小
    int size;
    int maxSize;
    Object[] queue;
    public SeqQueue() {
        initiate(defaultSize);
    }

    public SeqQueue(int sz){
        initiate(sz);
    }

    public void initiate(int sz){
        size = 0;
        maxSize = sz;
        queue = new Object[sz];
    }
    @Override
    public void EnQueue(Object obj) throws Exception {
        if(size==maxSize){
            throw new Exception("队列已满!");
        }
        queue[size++] = obj;
    }

    @Override
    public Object DeQueue() throws Exception {
        if (notEmpty()){
            throw new Exception("队列为空!");
        }
        Object temp = QueueFount();

        //整体向前移动
        for (int i = 0; i < size-1; i++) {
            queue[i] = queue[i+1];
        }
        size--;
        return temp;
    }

    @Override
    public Object QueueFount() throws Exception {
        if (notEmpty()){
            throw new Exception("队列为空!");
        }
        return queue[0];
    }

    @Override
    public boolean notEmpty() {
        return size==0;
    }
}
