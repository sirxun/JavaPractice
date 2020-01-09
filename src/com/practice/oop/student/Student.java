package com.practice.oop.student;

/**
 * @ClassName Student
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/6 10:24 上午
 **/
public class Student {
    float midGr;
    float endGr;
    float midRate;
    float endRate;
//    float totalGr;
    int studentId;
    String name;
    String sex;
    int age;
    Student(int studentId, int age, String name, String sex, float midGr, float midRate, float endGr, float endRate){
        this.studentId = studentId;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.midGr = midGr;
        this.midRate = midRate;
        this.endGr = endGr;
        this.endRate = endRate;
    }
    public float getTotalGr(){
        return midGr*midRate+endGr*endRate;
    }
    public static void main(String[] args){
        Student[] students = new Student[4];
        students[0] = new EnglishStudent(1,18,"xx1","male", 80, 90, 88, (float)0.5);
        students[1] = new ComputerStudent(2,20,"xx2","female", 90, 85, 90, (float)0.4, 87, (float) 0.2);
        students[2] = new EnglishStudent(3,19,"xx3","male", 85, 70, 100, (float)0.5);
        for(int i=0;i<students.length-1;i++){
            System.out.println("学号:"+students[i].studentId+" 姓名："+ students[i].name+" 性别："+students[i].sex+" 年龄："+students[i].age+" 综合成绩："+students[i].getTotalGr());
        }
    }
}

//class EnglishStudent extends Student{
//    float speakGr;
//    float speakRate;
//    EnglishStudent(int studentId, int age, String name, String sex, float midGr, float endGr, float speakGr, float speakRate){
//        super(studentId, age, name, sex, midGr, (float) 0.25, endGr, (float) 0.25);
//        this.speakGr = speakGr;
//        this.speakRate = speakRate;
//    }
//    public float getTotalGr(){
//        return this.speakGr*this.speakRate+super.getTotalGr();
//    }
//}

//class ComputerStudent extends Student{
//    float optGr;
//    float optRate = (float)0.4;
//    float enWriteGr;
//    float enWriteRate = (float)0.2;
//    ComputerStudent(int studentId, int age, String name, String sex, float midGr, float endGr, float optGr, float optRate, float enWriteGr,float enWriteRate){
//        super(studentId, age, name, sex, midGr, (float) 0.2, endGr, (float) 0.2);
//        this.optGr = optGr;
//        this.optRate = optRate;
//        this.enWriteGr = enWriteGr;
//        this.enWriteRate = enWriteRate;
//    }
//    public float getTotalGr(){
//        return this.optGr*this.optRate+this.enWriteGr*this.enWriteRate+super.getTotalGr();
//    }
//}