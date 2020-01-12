package com.practice.base;

/**
 * @ClassName PrintDiamond
 * @Author wanghui
 * @Description 7.输入菱形
 * @Date 2020/1/5 1:26 下午
 **/

public class PrintDiamond {
    public static void main(String[] args){
        int n = 9;
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=0;j<(n+1)/2-i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
        for (int i=1;i<=n/2;i++){
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }
            for (int j=i;j<n-i;j++){
                System.out.print('*');
            }
            System.out.println(' ');
        }

    }
}
