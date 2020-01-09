package com.practice.thread.AnnualMeeting;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName EntrMeeting
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 10:38 上午
 **/
//public class EntrMeeting extends Thread{
//    ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
//    String doorName;
//    public EntrMeeting(ArrayList<Employee> employeeArrayList, String doorName){
//        this.employeeArrayList = employeeArrayList;
//        this.doorName = doorName;
//    }
//    public void run(){
//        for(Employee employee:employeeArrayList){
//            employee.setDoor(this.doorName);
//            System.out.println("线程id："+this.getName()+" 编号为:" + employee.getId()+ "的员工 从" + this.doorName + "入场! 拿到的双色球彩票号码是:" +employee.getDubColorBallNum());
//        }
//    }
//}

public class EntrMeeting implements Runnable{
    Employee employee;
    String doorName;

    public EntrMeeting(Employee employee, String doorName){
        this.employee = employee;
        this.doorName = doorName;
    }
    @Override
    public void run() {
        if(employee.getDoor() == 0){
            this.doorName = "前门";
        }else if(employee.getDoor() == 1){
            this.doorName = "后门";
        }
        System.out.println("编号为:" + employee.getId()+ "的员工 从" + this.doorName + employee.getDoor()+"入场! 拿到的双色球彩票号码是:" +employee.getDubColorBallNum());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws InterruptedException{
//        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
//        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
//                2, //corePoolSize
//                2,	//maximumPoolSize
//                1L,
//                TimeUnit.SECONDS,
//                workQueue
//        );
//        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
//        for(int i=0; i<100;i++){
//            Employee employee = new Employee();
//            employee.setId(i);
//            employeeArrayList.add(employee);
//            if(employee.getId()==0){
//                EntrMeeting e = new EntrMeeting(employee,"前门");
//                threadPool.execute(e);
//                e.frontDoor++;
//            }else if(employee.getId()==1){
//                EntrMeeting e = new EntrMeeting(employee,"后门");
//                threadPool.execute(e);
//                e.backDoor++;
//            }
//        }
//        threadPool.shutdown();
//    }

}
