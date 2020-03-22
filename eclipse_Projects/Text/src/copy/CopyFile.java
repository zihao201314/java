package copy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
 
     /**
      * @param args
      */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("请输入复制的文件夹路径：");
         String inFiles = scanner.next();//String inFile = "C:\\Windows\\SysWOW64";
         System.out.print("请输入拷贝到的文件夹路径：");
         String outFiles = scanner.next();//String outFile = "C:\\Users\\Administrator\\Desktop\\64dll";
         System.out.print("请输入要复制文件类型，比如说txt文件，就输入：txt\r\n请输入：");
         String type = scanner.next();
         
         FileInputStream fis = null;
         FileOutputStream fos = null;
         try {
             File outFiled = new File(outFiles);
             if (!outFiled.exists()) {
                 outFiled.mkdirs();
             }
 
             File files = new File(inFiles);
 
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