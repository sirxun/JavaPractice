package com.practice.oop.company;

/**
 * @ClassName SalariedEmployee
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/7 4:59 下午
 **/
class SalariedEmployee extends ColaEmployee{
    float monthlySalary;
    public SalariedEmployee(String name,int month, float monthlySalary){
        super(name, month);
        this.monthlySalary = monthlySalary;
    }

    public float getSalary(int month){
        return this.monthlySalary+super.getSalary(month);
    }
}