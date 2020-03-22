package d2;

import java.io.File;
import java.io.IOException;

/**  
* 文件名: demo1.java 
* 作者：梓灏 
* 时间： 2019年1月2日 下午6:20:06 
*/
public class demo4 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\学习\\Java基础代码\\aaa1");
	//System.out.println(a.createNewFile());
		System.out.println(a.delete());
		}
}
