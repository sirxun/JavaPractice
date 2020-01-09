package com.practice.io.writeread;

import java.io.*;
import java.util.HashMap;

/**
 * @ClassName OptFile
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 3:24 下午
 **/
public class OptFile {
    private String documentPath;
    private String documentName = "ss";
    private String fileName = "s.txt";
    private String filePath;

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public File mkDocument(){
        File f = new File(documentPath+"/"+documentName);
        try{
            boolean ret = f.mkdir();
            if(ret){
                System.out.println(ret);
                return f;
            }else return null;

        }catch (Exception err){
            System.out.println(err.toString());
            return null;
        }
    }

    public void deleteFile(String filePath, File file){
        if(file.exists()){
            boolean ret = file.delete();
        }
    }
    public void writeContent(String filePath, String s, boolean append) throws IOException {
        File f = new File(filePath);
        // append为true表示追加写操作
        FileWriter fileWrt = new FileWriter(f,append);
        fileWrt.write(s);
        fileWrt.close();
    }

    public void readContent(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        HashMap<Character, Integer> hm = new HashMap<>();
        while(true){
            int c = fr.read();
            char s = (char)c;
            if(c==-1){
                break;
            }
            System.out.print(s);
            if(hm.containsKey(s)){
                int v = hm.get(s);
                hm.replace(s, v, v+1);
            }else{
                hm.put(s, 1);
            }
        }
        fr.close();
        System.out.println(hm);
    }
}
