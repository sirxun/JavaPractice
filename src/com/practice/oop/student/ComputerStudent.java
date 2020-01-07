package com.practice.oop.student;

/**
 * @ClassName ComputerStudent
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/7 5:03 下午
 **/
class ComputerStudent extends Student{
    float optGr;
    float optRate = (float)0.4;
    float enWriteGr;
    float enWriteRate = (float)0.2;
    ComputerStudent(int studentId, int age, String name, String sex, float midGr, float endGr, float optGr, float optRate, float enWriteGr,float enWriteRate){
        super(studentId, age, name, sex, midGr, (float) 0.2, endGr, (float) 0.2);
        this.optGr = optGr;
        this.optRate = optRate;
        this.enWriteGr = enWriteGr;
        this.enWriteRate = enWriteRate;
    }
    public float getTotalGr(){
        return this.optGr*this.optRate+this.enWriteGr*this.enWriteRate+super.getTotalGr();
    }
}