package com.practice.oop.car;

/**
 * @ClassName Car
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/5 3:17 下午
 **/
public class Car extends Vehicle {
    private int loader;
    public Car(int nLoader, String nBrand,String nColor){
        super(nBrand, nColor);
        this.loader = nLoader;
    }
    public void run() {
        System.out.println(getColor() + "载人人数是" + loader + getBrand() + "的速度是" + getSpeed());
    }
    public static void main(String[] args){
        Car car = new Car(2,"Honda‖","Red‖");
        car.run();
    }
}
