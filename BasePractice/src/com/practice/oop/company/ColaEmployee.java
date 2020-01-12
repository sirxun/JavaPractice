package com.practice.oop.company;

import java.lang.*;

/**
 * @ClassName ColaEmployee
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/5 3:36 下午
 **/
public class ColaEmployee {
    private String name;
    private int month;

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public ColaEmployee(String name, int month){
        this.name = name;
        this.month = month;
    }
    public float getSalary(int month) {
        if(month==this.month){
            return 100;
        }else {
            return 0;
        }
    }
    public static void main(String[] args){
        ColaEmployee[] employee = new ColaEmployee[3];
        employee[0] = new SalariedEmployee("xx1",2,5000);
        employee[1] = new HourlyEmployee("xx2", 5, 50, 200);
        employee[2] = new SalesEmployee("xx3",12, 80000,  (float)0.1);
        Company c = new Company();
        System.out.println("xx1的工资为："+employee[0].getSalary(2));
        System.out.println("xx2的工资为："+employee[1].getSalary(2));
        System.out.println("xx3的工资为："+employee[2].getSalary(2));
        System.out.println("**************************");
        System.out.println("xx1的工资为："+c.companySalary(employee[0], 2));
        System.out.println("xx2的工资为："+c.companySalary(employee[1], 2));
        System.out.println("xx3的工资为："+c.companySalary(employee[2], 2));

    }
}

//class SalariedEmployee extends ColaEmployee{
//    float monthlySalary;
//    public SalariedEmployee(String name,int month, float monthlySalary){
//        super(name, month);
//        this.monthlySalary = monthlySalary;
//    }
//
//    public float getSalary(int month){
//        return this.monthlySalary+super.getSalary(month);
//    }
//}

//public class HourlyEmployee extends ColaEmployee{
//    float hourlySalary;
//    int workHours;
//    int standardHours=170;
//    public HourlyEmployee(String name, int month, float hourlySalary,int workHours){
//        super(name, month);
//        this.hourlySalary = hourlySalary;
//        this.workHours = workHours;
//    }
//    public float getSalary(int month){
//
//        if(workHours>standardHours){
//            return standardHours*hourlySalary+(workHours-standardHours)*hourlySalary*(float)1.5+super.getSalary(month);
//        }else{
//            return standardHours*hourlySalary+super.getSalary(month);
//        }
//    }
//}

//class SalesEmployee extends ColaEmployee{
//    float salesNum;
//    float reyRate;
//    public SalesEmployee(String name, int month, float salesNum, float reyRate){
//        super(name, month);
//        this.salesNum = salesNum;
//        this.reyRate = reyRate;
//    }
//
//    public float getSalary(int month){
//        return salesNum*reyRate + super.getSalary(month);
//    }
//}

//class Company {
//    public float companySalary(ColaEmployee c, int month){
//        return c.getSalary(month);
//    }
//}
