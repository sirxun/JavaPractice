package com.practice.base;

/**
 * @ClassName BubbleSort
 * @Author wanghui
 * @Description 4.把一组数由小到大排序
 * @Date 2020/1/4 9:10 下午
 **/

public class BubbleSort {
    public int[] bubbleSort(int[] input){
        for(int i=1; i<input.length;i++){
            for(int j=0;j<input.length-i;j++){
                if(input[j]>input[j+1]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args){
        String input = ReverseInput.inputStr("请输入整数,并用逗号隔开:\n");
        String[] tmp_l = input.split(",");
        int[] l = new int[tmp_l.length];
        try{
            for(int i=0;i<tmp_l.length;i++){
                l[i] = Integer.parseInt(tmp_l[i]);
            }
        }catch (NumberFormatException err){
            System.out.println("请勿输入非数字的符号!");
            return;
        }


//        第一种 冒泡排序
        BubbleSort b = new BubbleSort();
        l = b.bubbleSort(l);
////        第二种方法 使用java.util.Arrays库排序方法
//        Arrays.sort(l);
        for (int value : l) {
            System.out.println(value);
        }

    }
}
