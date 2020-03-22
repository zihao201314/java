package d2;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**  
* 文件名: demo1.java 
* 作者：梓灏 
* 时间： 2019年1月2日 下午6:20:06 
*/
public class demo6 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\学习\\Java基础代码");
		String b=".java";
		String[] d=demo6.aaa(a, b);
		for (String s : d) {
			System.out.println(s);
		}
		
	}
	public static String[] aaa(File a,String b) {
		String[] c=a.list();
		List<String> d=new ArrayList<String>();
		for (String s : c) {
			if(s.endsWith(b)) {
				d.add(s);
			}
		}
		return d.toArray(new String[d.size()]);
	}
}
