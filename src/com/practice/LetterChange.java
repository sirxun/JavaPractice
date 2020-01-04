package com.practice;

/**
 * @ClassName LetterChange
 * @Author wanghui
 * @Description 3.输入字符串，将字符串中的大写变小写，小写变大写
 * @Date 2020/1/4 8:31 下午
 **/
public class LetterChange {

    public String LetterChange(String input){
        char[] tmp_arr = input.toCharArray();
        for(int i=0;i<input.length();i++){

            if(tmp_arr[i]>='a' && tmp_arr[i]<='z'){
                tmp_arr[i] -= 32;
            }else if(tmp_arr[i]>='A' && tmp_arr[i]<='Z'){
                tmp_arr[i] += 32;
            }else{
                System.out.println("请输入全字母字符串！");
                continue;
            }
        }
        return String.valueOf(tmp_arr);
    }

    public static void main(String[] args){
        String s = ReverseInput.inputStr("请输入字符串：");
        LetterChange l = new LetterChange();
        s = l.LetterChange(s);
        System.out.println(s);
    }
}
