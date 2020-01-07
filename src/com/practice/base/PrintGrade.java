package com.practice.base;

/**
 * @ClassName PrintGrade
 * @Author wanghui
 * @Description 5.打印成绩
 * @Date 2020/1/4 10:17 下午
 **/
public class PrintGrade {
    public char printGrade(int input){
        char grade;
        grade = input>=90 ?'A':
                (input<90 && input>=60) ?'B': 'C';
        return grade;
    }
    public static void main(String[] args){
        PrintGrade p = new PrintGrade();
        String input = ReverseInput.inputStr("请输入成绩值：\n");
        int tmp;
        try{
            tmp = Integer.parseInt(input);
        }catch (NumberFormatException err){
            System.out.println("请输入数字！");
            return;
        }
        char x = p.printGrade(tmp);
        System.out.println(x);
    }
}
