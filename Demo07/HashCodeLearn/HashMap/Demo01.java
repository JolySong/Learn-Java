package HashCodeLearn.HashMap;
//统计字符串中个每个字符出现的次数

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串: ");
        String str = sc.next();
        char c[] = str.toCharArray();


        //3.遍历字符串，获取每一个字符
        for (int i=0; i<c.length; i++){

            //3.1 判断key是否存在
            if(map.containsKey(c[i])){
                Integer value = map.get(c[i]);
                value++;
                map.put(c[i],value);
            }else{
                map.put(c[i],1);
            }
        }

        //遍历map集合输出结果
        for( Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
