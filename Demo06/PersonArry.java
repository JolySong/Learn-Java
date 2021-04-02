package Demo06;

import java.util.Random;

public class PersonArry {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        Person[] array = new Person[3];
        SetPerson(array);
        PrintPerson(array);
    }

    public static void SetPerson(Person array[]){
        Random r = new Random();
        for (int i=0; i< array.length; i++){
            array[i] = new Person();
            array[i].setM_Age(r.nextInt(30)+1);
            array[i].setM_Name("p"+(i+1));
            array[i].setM_Sex("Man");
        }
    }

    public static void PrintPerson(Person array[]){
        for(int i=0; i<array.length; i++){
            System.out.print("地址"+array[i]+" ");
            array[i].Show();
        }
    }

}
