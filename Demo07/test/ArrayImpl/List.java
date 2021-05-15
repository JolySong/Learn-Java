package test.ArrayImpl;

public interface List {
    //插入数据元素
    public void Insert(int i, Object obj) throws Exception;

    //删除数据元素
    public Object Delect(int i, Object obj) throws Exception;

    //修改数据元素
    public void Update(int i, Object obj) throws Exception;

    //获取数据元素
    public Object getDate(int i,Object obj) throws Exception;

    public void PrintAll();

    //获取数据元素个数
    public int size();

    //判断是否为空
    public boolean isEmpty();
}
