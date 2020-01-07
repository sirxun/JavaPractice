package com.practice.oop.company;

/**
 * @ClassName SalesEmployee
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/7 5:00 下午
 **/
class SalesEmployee extends ColaEmployee{
    float salesNum;
    float reyRate;
    public SalesEmployee(String name, int month, float salesNum, float reyRate){
        super(name, month);
        this.salesNum = salesNum;
        this.reyRate = reyRate;
    }

    public float getSalary(int month){
        return salesNum*reyRate + super.getSalary(month);
    }
}