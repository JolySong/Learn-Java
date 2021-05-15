package test.ArrayImpl;

public class SeqList implements List{
    final int defaultSize = 10;//默认长度
    int maxSize;        //长度
    int size;           //现有元素个数
    Object[] listArray; //用对象数组存储线性表

    public SeqList() {
        Initiate(defaultSize);
    }

    public SeqList(int size) {
        Initiate(size);
    }

    //初始化
    public void Initiate(int sz){
        maxSize = sz;
        size = 0;
        listArray = new Object[sz];
    }

    @Override
    public void Insert(int i, Object obj) throws Exception {
        if(size==maxSize){
            throw new Exception("线性表已满!");
        }
        //只允许一个一个插入，不允许隔空位插
        if(i>size){
            throw new Exception("插入下标位置错误!");
        }

        listArray[i] = obj;
        size++;

    }

    @Override
    public Object Delect(int i, Object obj) throws Exception {
        if(isEmpty()){
            throw new Exception("线性表为空!");
        }
        if(i>size-1 || i<0){
            throw new Exception("删除下标位置错误!");
        }
        //获取被删除的元素
        Object it = listArray[i];
        for (int j=i;j<size-1;j--){
            //从后一个元素往前开始覆盖
            listArray[j] = listArray[j+1];
        }
        size--;
        System.out.println("删除成功!");
        return it;
    }

    @Override
    public void Update(int i, Object obj) throws Exception {
        if(isEmpty()){
            throw new Exception("线性表为空!");
        }
        if(i>size-1 || i<0){
            throw new Exception("替换下标位置错误!");
        }
        listArray[i] = obj;
        System.out.println("替换成功!");
    }

    @Override
    public Object getDate(int i, Object obj) throws Exception {
        if(isEmpty()){
            throw new Exception("线性表为空!");
        }
        if(i>size-1 || i<0){
            throw new Exception("获取下标位置错误!");
        }
        return listArray[i];
    }

    @Override
    public void PrintAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(listArray[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
