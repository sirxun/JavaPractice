package com.practice;

/**
 * @ClassName StrToUpper
 * @Author wanghui
 * @Description 2.输入一个小写字母，输入该字母的大写
 * @Date 2020/1/4 5:06 下午
 **/
public class StrToUpper {
    public Boolean checkUpperCase(String input){
        if(input.length()>1 || input.length()<=0){
            System.out.println("请输入一个字母");
            return false;
        }else{
            char c = input.charAt(0);
            int asc = (int)c;
            if(asc>=97 && asc<=122){
//                System.out.println("小写");
                return true;
            }else if(asc>=65 && asc<=90){
                System.out.println("请输入小写字母！");
                return false;
            }else{
                System.out.println("请输入小写字母！");
                return false;
            }
        }

    }
    public static void main(String[] args){
        String s = ReverseInput.inputStr("请输入一个小写字母：");
        StrToUpper tmp = new StrToUpper();
        Boolean flag = tmp.checkUpperCase(s);
        if(flag){
            System.out.println("转换为大写字母："+s.toUpperCase());
        }

    }
}
