package test.StackImpl;

public class SeqStack implements Stack{
    final int defaultSize = 10; //栈顶默认大小
    int top;    //标记栈顶顶位置
    int maxStackSize;   //栈顶最大容量
    Object[] stack;

    public SeqStack() {
        initiate(defaultSize);
    }

    public SeqStack(int size) {
        initiate(size);
    }

    public void initiate(int size){
        maxStackSize = size;
        top = 0;
        stack = new Object[maxStackSize];
    }

    @Override
    public void push(Object obj) throws Exception {
        if(top == maxStackSize){
            throw new Exception("栈已满!");
        }
        stack[top++] = obj;
    }

    @Override
    public Object pop() throws Exception {
        if(notEmpty()){
            throw new Exception("栈为空!");
        }
        return stack[--top];
    }

    @Override
    public Object getTop() throws Exception {
        if(notEmpty()){
            throw new Exception("栈为空!");
        }
        return stack[top-1];
    }

    @Override
    public boolean notEmpty() {
        return top==0;
    }
}
