package com.practice.oop.computer;

/**
 * @ClassName Number
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 2:51 下午
 **/
public class Number {
    private long n1;
    private long n2;

    public void setN1(long n1) {
        this.n1 = n1;
    }

    public void setN2(long n2) {
        this.n2 = n2;
    }

    public long addition(){
        return n1+n2;
    }

    public long subtration(){
        return n1-n2;
    }
    public long multiplication(){
        return n1*n2;
    }
    public double division() throws ArithmeticException{
        try {
            return n1/n2;
        }catch (ArithmeticException aError){
            System.out.println("分母不能为0, "+aError.toString());
            return 0;
        }

    }
}
