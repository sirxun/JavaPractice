package com.practice.reflect;
import com.practice.base.PrintDiamond;
import com.practice.oop.company.ColaEmployee;
import com.practice.oop.company.HourlyEmployee;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;


/**
 * @ClassName ReflectDemo
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/6 3:51 下午
 **/
public class ReflectDemo {
    public static void reflectDemo1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<ColaEmployee> cola = ColaEmployee.class;
        Constructor<ColaEmployee> constructor = cola.getConstructor(String.class, int.class);
        System.out.println(constructor);
        ColaEmployee colaEmployee = constructor.newInstance("zhangsan", 10);
        float s = colaEmployee.getSalary(10);
        System.out.println(colaEmployee.getName()+"生日月份为："+ colaEmployee.getMonth()+"月,当前月份为：10月，本月生日奖金为："+s);
        colaEmployee.setName("lisi");
        colaEmployee.setMonth(2);
        System.out.println(colaEmployee.getName()+"生日月份为："+ colaEmployee.getMonth()+"月,当前月份为：10月，本月生日奖金为："+colaEmployee.getSalary(10));
    }

    public static void reflectDemo2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<PrintDiamond> printDiamondClass = PrintDiamond.class;
        Method method = printDiamondClass.getMethod("main", String[].class);
        System.out.println(method);
        String[] args = new String [] {};
        method.invoke(null, (Object) args);
    }


    public static void reflectDemo3() {
        Class<HourlyEmployee> cola = HourlyEmployee.class;
        Class<?> c = cola.getSuperclass();
        System.out.println("HourlyEmployee父类为："+c);

    }

    public static void reflectDemo4(){
        Object l = Array.newInstance(int.class, 10);
        for(int i=0;i<10;i++){
            Array.setInt(l, i, i*2);
            int tmp = Array.getInt(l, i);
            System.out.println(tmp);
        }
        System.out.println("长度为："+Array.getLength(l));
//        System.out.println(l.toString());

        Class<?> lType = l.getClass();
        System.out.println(lType.getTypeName());
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        reflectDemo1();
        reflectDemo2();
        reflectDemo3();
        reflectDemo4();
    }
}

