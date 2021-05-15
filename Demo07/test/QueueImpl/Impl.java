package test.QueueImpl;

public class Impl {
    public static void main(String[] args) {
        SeqQueue queue = new SeqQueue();
        try {
            for (int i = 0; i < 11; i++) {
                try {
                    queue.EnQueue(i+1);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                for (int i = 0; i < 11; i++) {
                    try {
                        System.out.println(queue.DeQueue());
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("执行完毕！");
    }
}
