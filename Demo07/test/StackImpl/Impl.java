package test.StackImpl;

public class Impl {
    public static void main(String[] args) {
        SeqStack seqStack = new SeqStack();

        try {
            for (int i = 0; i < 11; i++) {
                try {
                    seqStack.push(1+i);
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
                        System.out.println(seqStack.pop());
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }catch (Exception e){
                System.out.println(e);
            }

        }
        System.out.println("执行完毕");
    }
}
