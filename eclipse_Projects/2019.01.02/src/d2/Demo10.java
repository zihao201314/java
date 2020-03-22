package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**  
* 文件名: Demo8.java 
* 作者：梓灏 
* 时间： 2019年1月3日 下午11:10:28 
*/
public class Demo10 {
public static void main(String[] args) throws IOException {
	FileReader b= new FileReader("F:\\学习\\\\Java基础代码\\777.txt");
	char[] c=new char[5];
	int a=0;
	while((a= b.read(c))!= -1) {
		System.out.print(new String(c,0,a) );
	}
}
}
