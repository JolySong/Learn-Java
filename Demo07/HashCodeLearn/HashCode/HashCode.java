package HashCodeLearn.HashCode;

public class HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        int h1 = p1.hashCode();
        System.out.println(h1);  //603742814

        int h2 = p2.hashCode();
        System.out.println(h2);  //1067040082

        /*
        toString方法的源码:
            return getClass().getName()+"@"+Integer.toHexString(hashCode());
        */
        System.out.println(p1); //HashCodeLearn.Person@23fc625e == 十进制603742814
        System.out.println(p2); //HashCodeLearn.Person@3f99bd52 == 十进制1067040082

        System.out.println(p1==p2); //false

        /*
            String类的哈希值
                String类重写Object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode()); //96354
        System.out.println(s2.hashCode()); //96354

        System.out.println("重地".hashCode());  //1179395
        System.out.println("通话".hashCode());  //1179395
    }
}
