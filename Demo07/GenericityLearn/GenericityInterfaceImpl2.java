package GenericityLearn;

/*
    含有范型的接口第二种使用方式: 接口用什么类型，实现类就用什么类型
                             实现类跟着接口走
                       相当于定义含有泛型的类，创建对象的时候使用什么类型才确定泛型的类型
 */
public class GenericityInterfaceImpl2<T> implements GenericityInterface<T> {

    @Override
    public void mythod(T t) {
        System.out.println(t);
    }
}
