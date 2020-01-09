package com.practice.io.checkfilenum;

import java.io.File;
import java.util.Scanner;

/**
 * @ClassName GetNum
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 4:59 下午
 **/
public class GetNum {
    private String documentPath;
    int isD = 0;
    int isF = 0;
    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public static void main(String[] args){
        GetNum getNum = new GetNum();
        System.out.println("请输入目录路径：");
        Scanner scanner = new Scanner(System.in);
        String documentPath = scanner.nextLine();
        getNum.setDocumentPath(documentPath);
        File f = new File(getNum.documentPath);
        File[] sl = f.listFiles();

        assert sl != null;
        for(File fl: sl){
            if(fl.isDirectory()){
                getNum.isD++;
                System.out.println(fl.getName()+"是文件夹");
            }else if(fl.isFile()){
                getNum.isF++;
                System.out.println(fl.getName()+"是文件");
            }
        }
        System.out.println("文件夹总计："+ getNum.isD+"个");
        System.out.println("文件总计："+ getNum.isF+"个");
    }
}
