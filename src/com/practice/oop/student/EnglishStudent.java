package com.practice.oop.student;

/**
 * @ClassName EnglishStudent
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/7 5:03 下午
 **/
class EnglishStudent extends Student{
    float speakGr;
    float speakRate;
    EnglishStudent(int studentId, int age, String name, String sex, float midGr, float endGr, float speakGr, float speakRate){
        super(studentId, age, name, sex, midGr, (float) 0.25, endGr, (float) 0.25);
        this.speakGr = speakGr;
        this.speakRate = speakRate;
    }
    public float getTotalGr(){
        return this.speakGr*this.speakRate+super.getTotalGr();
    }
}
