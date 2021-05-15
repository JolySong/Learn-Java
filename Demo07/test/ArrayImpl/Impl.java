package test.ArrayImpl;

public class Impl {
    public static void main(String[] args) throws Exception {
        SeqList list = new SeqList(10);

        try {
            list.Insert(0, new Integer(11));
            list.Insert(1, 22);
            list.Insert(2, 33);
            list.Insert(4, 55);
            list.Insert(3, 55);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("线性表的元素个数: " + list.size);
            list.PrintAll();
        }

        System.out.println("执行完毕!");
    }
}
