package d2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**  
* 文件名: demo1.java 
* 作者：梓灏 
* 时间： 2019年1月2日 下午6:20:06 
*/
public class demo1 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\学习\\Java基础代码\\666.txt");
		byte[] c=new byte[5];
		FileInputStream b=new FileInputStream(a);
		int i;
		while ((i=b.read(c))!=-1) {
//			for (int j = 0; j < i; j++) {
//			System.out.print((char)c[j]);
//				
//			}
			
			System.out.print(new String(c,0,i));
		}
				
		}
}
