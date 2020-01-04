package com.practice;
import java.util.Scanner;

/**
 * @ClassName ReverseInput
 * @Author wanghui
 * @Description 1.终端输入3个数字，倒序输出
 * @Date 2020/1/4 3:45 下午
 **/
public class ReverseInput {
    public static String inputStr(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        return scan.nextLine();
    }
    public static Boolean checkInput(String input){

        if(input.length()!=3){
            System.out.println("输入错误：非三位数");
            return false;
        }else{
            try{
                Integer.parseInt(input);
                return true;
            }catch (NumberFormatException err){
                System.out.println("输入错误：非数字\n"+err);
                return false;
            }
        }
    }
    public static String reverseStr(String input){
        char[] tmpArray =  input.toCharArray();
//        // 第一种方式
//        StringBuilder desStr = new StringBuilder();
//        for(int i=(input.length()-1);i>=0;i--){
//            System.out.println(tmpArray[i]);
//            desStr.append(tmpArray[i]);
//        }
//        return desStr.toString();

        // 第二种方式
        for(int start=0,end=input.length()-1; start<end; start++,end--){
            char tmp = tmpArray[start];
            tmpArray[start] = tmpArray[end];
            tmpArray[end] = tmp;
        }
        return new String(tmpArray);
    }

    public static void main(String[] args){
        ReverseInput r = new ReverseInput();
        String input = inputStr("请输入3位数字：\n");
        Boolean b = checkInput(input);
        if(b){
            String s = r.reverseStr(input);
            System.out.println("反转后:"+s);
        }
    }
}
