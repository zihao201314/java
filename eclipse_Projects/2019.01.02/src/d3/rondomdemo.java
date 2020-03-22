package d3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**  
* 文件名: rondomdemo.java 
* 作者：梓灏 
* 时间： 2019年1月5日 下午5:16:22 
*/
public class rondomdemo {
public static void main(String[] args) throws Exception {
	RandomAccessFile a=new RandomAccessFile("F:\\学习\\Java基础代码\\12345.txt", "rw");
	System.out.println(a.getFilePointer());
	a.writeChars("丁以前");
	System.out.println(a.getFilePointer());
	a.seek(4);
	System.out.println(a.getFilePointer());
	System.out.println(a.readChar());
	System.out.println(a.getFilePointer());
}
}
