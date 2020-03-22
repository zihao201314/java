package copy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile2 {
 
     /**
      * @param args
      */
     public static void copy(File files) {
  
         String outFiles = "C:\\Users\\16685\\Desktop\\新建文件夹";
         String type = "docx";
         
         FileInputStream fis = null;
         FileOutputStream fos = null;
         try {
             File outFiled = new File(outFiles);
             if (!outFiled.exists()) {
                 outFiled.mkdirs();
             }
              if (files.exists()) {
                 File[] listFiles = files.listFiles();
                 if (listFiles != null && listFiles.length > 0) {
                     for (File file : listFiles) {
                         String fileName = file.getName();
                         String[] str = fileName.split("\\.");
                         if (str[str.length-1].equals(type)) {
                             fis = new FileInputStream(file);
                             fos = new FileOutputStream(new File(outFiled, fileName));
                             byte[] buf = new byte[1024];
                             int bytesRead;
                             while ((bytesRead = fis.read(buf)) > 0) {
                                 fos.write(buf, 0, bytesRead);
 
                             }
                         }
                     }
                 }
 
             }
         } catch (IOException e) {
             e.printStackTrace();
         } finally {//关闭资源
             if(fos != null) {
                 try {
                     fos.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             if(fis != null) {
                 try {
                     fis.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
     }
 
 }