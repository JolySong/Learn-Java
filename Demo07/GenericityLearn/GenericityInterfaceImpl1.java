package GenericityLearn;

/*
genericityInterface接口的实现类
 */
public class GenericityInterfaceImpl1 implements GenericityInterface<String>{

    @Override
    public void mythod(String s) {
        System.out.println(s);
    }
}
