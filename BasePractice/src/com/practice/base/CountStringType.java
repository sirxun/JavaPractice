package com.practice.base;

/**
 * @ClassName CountStringType
 * @Author wanghui
 * @Description 6.统计字符串中的字母数字空格个数
 * @Date 2020/1/4 10:36 下午
 **/
public class CountStringType {
    public String countStringType(String input){
        char[] charArg = input.toCharArray();
        int letterNum = 0;
        int numberNum = 0;
        int blankNum = 0;
        int otherNum = 0;
        for(int i=0;i<input.length();i++){
            int asc = (int) charArg[i];
            if((asc<=90 && asc>=65) ||( asc<=122 && asc>=97)){
                letterNum++;
            }else if(asc<=57 && asc>=48){
                numberNum++;
            }else if(asc==32){
                blankNum++;
            }else otherNum++;
        }
        return "包含字母："+ letterNum+"个; \n包含数字："+numberNum+"个;\n包含空格："+blankNum+"个;\n包含其他字符："+otherNum+"个。\n";
    }
    public static void main(String[] args){
        String s = ReverseInput.inputStr("输入字符串:\n");
        CountStringType c = new CountStringType();
        System.out.println(c.countStringType(s));

    }
}
