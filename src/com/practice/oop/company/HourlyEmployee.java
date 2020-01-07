package com.practice.oop.company;

/**
 * @ClassName HourlyEmployee
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/7 4:58 下午
 **/
public class HourlyEmployee extends ColaEmployee{
    float hourlySalary;
    int workHours;
    int standardHours=170;
    public HourlyEmployee(String name, int month, float hourlySalary,int workHours){
        super(name, month);
        this.hourlySalary = hourlySalary;
        this.workHours = workHours;
    }
    public float getSalary(int month){

        if(workHours>standardHours){
            return standardHours*hourlySalary+(workHours-standardHours)*hourlySalary*(float)1.5+super.getSalary(month);
        }else{
            return standardHours*hourlySalary+super.getSalary(month);
        }
    }
}