package com.practice.oop.computer;

/**
 * @ClassName Main
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 2:50 下午
 **/
public class Main {
    public static void main(String[] args) throws ArithmeticException{
        Number n = new Number();
        n.setN1(100);
        n.setN2(0);
        long r1 = n.addition();
        long r2 = n.subtration();
        double r3 = n.division();
        long r4 = n.multiplication();
        System.out.println(r1+"----"+r2+"----"+r3+"----"+r4);
    }
}
