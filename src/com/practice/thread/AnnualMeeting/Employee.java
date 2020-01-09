package com.practice.thread.AnnualMeeting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @ClassName Employee
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 10:23 上午
 **/
public class Employee {
    private Integer Id;
    private ArrayList<Integer> dubColorBallNum = new ArrayList<Integer>(7);
    private Integer door;

    public Employee(){
        Random r = new Random();
        for (int i=0; i<6; i++){
            int firstNum = r.nextInt(33)+1;
            this.dubColorBallNum.add(firstNum);
        }
        int secNum = r.nextInt(16)+1;
        this.dubColorBallNum.add(secNum);
        this.door = r.nextInt(2);
    }

    public ArrayList<Integer> getDubColorBallNum() {
        return dubColorBallNum;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

//    public void setDoor() {
//        Random r = new Random();
//        this.door = r.nextInt(2);
//    }

    public Integer getDoor() {
        return door;
    }
}
