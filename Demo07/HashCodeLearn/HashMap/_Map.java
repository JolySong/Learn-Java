package HashCodeLearn.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _Map {
    public static void main(String[] args) {
        test01();
    }


    private static void test01() {
        //创建map集合对象
        Map<String,Integer>map = new HashMap<>();

        //public V put(K key, V value); 添加元素
        map.put("AAA",160);
        map.put("BBB",165);
        map.put("CCC",170);
        map.put("DDD",175);
        System.out.println(map);

        //public V remove(Object key); 删除元素

        //int value = map.remove("AAA");  自动拆箱 NullPointException
        Integer value = map.remove("AAA");
        System.out.println(value);  //160
        value = map.remove("AAA");
        System.out.println(value);  //null

        //public V get(Object key) 根据指定的键，在map容器中获得对应的值。
        value = map.get("CCC");
        System.out.println(value);

        //boolean containKey(Object key) 判断是否包含
        boolean result = map.containsKey("AAA");  //false
        System.out.println(result);
        result = map.containsKey("BBB");
        System.out.println(result); //true

        //map集合的遍历 1 迭代器遍历
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer v = map.get(key);
            System.out.println(key+" = "+v);
        }
        //增强for遍历
        for(String key : map.keySet()){
            Integer v = map.get(key);
            System.out.println(key+" = "+v);
        }

        //map集合的遍历 2 entrySet()
        Set<Map.Entry<String, Integer>>  set1 = map.entrySet();

        //迭代器
        Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
        while(it1.hasNext()){
            Map.Entry<String, Integer> entry = it1.next();
            String key = entry.getKey();
            Integer Value = entry.getValue();
            System.out.println(key +"=" + Value);
        }

        //增强for
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
        


    }
}
