package com.practice.thread.AnnualMeeting;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName Main
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 1:45 下午
 **/
public class Main  {
    public static void main(String[] args) throws InterruptedException{

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2, //corePoolSize
                2,	//maximumPoolSize
                1L,
                TimeUnit.SECONDS,
                workQueue
        );
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        for(int i=0; i<100;i++){
            Employee employee = new Employee();
            employee.setId(i);
            employeeArrayList.add(employee);
        }
        int frontDoor = 0;
        int backDoor = 0;
        System.out.println(employeeArrayList.size());
        for(Employee employee: employeeArrayList){
            if(employee.getDoor()==0){
                EntrMeeting e0 = new EntrMeeting(employee, "前门");
                threadPool.execute(e0);
                frontDoor++;

            }else if(employee.getDoor()==1){
                EntrMeeting e1 = new EntrMeeting(employee, "后门");
                threadPool.execute(e1);
                backDoor++;

            }else{
                System.out.println("没有从门进入: "+employee.getDoor());
            }
//            System.out.println("已经完成任务数量："+threadPool.getTaskCount()+"  poolsize："+threadPool.getActiveCount());
        }
//        System.out.println("线程池中队列中的线程数量：" + workQueue.size());
        System.out.println("从后门入场的员工总共: "+ backDoor +" 位员工");
        System.out.println("从前门入场的员工总共: "+ frontDoor +" 位员工" );
        threadPool.shutdown();
    }
}
