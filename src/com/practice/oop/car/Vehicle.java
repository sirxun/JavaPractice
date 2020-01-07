package com.practice.oop.car;

/**
 * @ClassName Vehicle
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/5 2:36 下午
 **/
public class Vehicle {
    private String brand;
    private String color;
    private double speed;

    public Vehicle(String nBrand, String nColor){
        brand = nBrand;
        this.color = nColor;
        this.speed = 0;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void run(){
        System.out.println(getColor() + "的" + getBrand() + "的速度是" + getSpeed());
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle("benz‖", "Black‖");
        v.run();
    }
}
