package com.practice.io.movefile;

import com.practice.io.writeread.OptFile;

import java.io.*;
import java.net.URL;

/**
 * @ClassName MovePicture
 * @Author wanghui@xsyxsc.com
 * @Description TODO
 * @Date 2020/1/8 5:19 下午
 **/
public class MovePicture {
    //链接url下载图片
     public static void downloadPicture(String urlList, String path) {
         URL url = null;
         try {
             url = new URL(urlList);
             DataInputStream dataInputStream = new DataInputStream(url.openStream());

             FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
             ByteArrayOutputStream output = new ByteArrayOutputStream();

             byte[] buffer = new byte[1024];
             int length;

             while ((length = dataInputStream.read(buffer)) > 0) {
                 output.write(buffer, 0, length);
             }
             fileOutputStream.write(output.toByteArray());
             dataInputStream.close();
             fileOutputStream.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

     public void copyFile(File fIn, File fOut) throws IOException {
         FileInputStream fis = new FileInputStream(fIn);
         FileOutputStream fos = new FileOutputStream(fOut);

         byte[] read = new byte[1024];
         int len = 0;
         while((len = fis.read(read))!= -1){
             fos.write(read,0,len);
         }
         fis.close();
         fos.flush();
         fos.close();
     }

     public static void main(String[] args) throws IOException {
         String path = System.getProperty("user.dir");
         System.out.println(path);

         // 通过网络下载文件
         String url = "http://www.ithov.com/uploads/litimg/200801/20080114113124478.jpg";
         path = path+"/src/com/practice/io/movefile/";
         downloadPicture(url, path+"test.jpg");

         // 新建文件对象
         File fIn = new File(path+"test.jpg");
         File fOut = new File(path+"test1.jpg");
         System.out.println("下载文件结果：");
         System.out.println(fIn.exists());

         // 新建文件流对象，用于复制文件
         MovePicture mp = new MovePicture();
         mp.copyFile(fIn, fOut);
         System.out.println("复制文件结果：");
         System.out.println(fOut.exists());

         // 清除之前余下文件
         OptFile optFile = new OptFile();
         optFile.deleteFile(path+"test.jpg", fIn);
         optFile.deleteFile(path+"test1.jpg", fOut);
     }

}
