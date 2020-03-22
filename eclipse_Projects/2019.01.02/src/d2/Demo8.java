package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**  
* 文件名: Demo8.java 
* 作者：梓灏 
* 时间： 2019年1月3日 下午11:10:28 
*/
public class Demo8 {
public static void main(String[] args) throws IOException {
	File a=new File("F:\\学习\\\\Java基础代码\\777.txt");
	FileOutputStream b=new FileOutputStream(a,true);
	b.write("asdasdasdsad".getBytes());
}
}
