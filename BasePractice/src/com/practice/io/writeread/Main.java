package com.practice.io.writeread;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Main
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 3:24 下午
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        OptFile optFile = new OptFile();
        optFile.setDocumentPath("/Users/wanghui/JavaPractice/BasePractice/src/com/practice/io/writeread/");
        File f = optFile.mkDocument();
        optFile.setFilePath("/Users/wanghui/JavaPractice/BasePractice/src/com/practice/io/writeread/ss/s.txt");
        String filePath = optFile.getFilePath();
        optFile.writeContent(filePath,"hello world!", false);
        optFile.readContent(filePath);
        System.out.println(" ");
        optFile.writeContent(filePath,"你好啊 中国！", true);
        optFile.readContent(filePath);
    }
}
