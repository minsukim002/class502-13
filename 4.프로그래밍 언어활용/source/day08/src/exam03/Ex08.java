package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Ex08 {
    public static void main(String[] args) {
        Class cls1 = Person.class;

        Field[] fields = cls1.getFields();
        Method[] methods =cls1.getMethods();
        Constructor[] constructors =cls1.getConstructors();

        System.out.println("=-----Fields------");
        for (Field field : fields){
            System.out.println(field);
        }

        System.out.println("--------Construtor-----");
        for (Constructor constructor : constructors) {
            System.out.println(constructor);

        }
        System.out.println("-----Methods----");
        for(Method method : methods){
            System.out.println(method);
        }

        Person person = new Person();
        Class cls2 = person.getClass(); //클래스 내부에서 사용할 목적
    }
}
