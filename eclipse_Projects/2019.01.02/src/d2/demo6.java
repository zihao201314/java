package d2;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**  
* �ļ���: demo1.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:20:06 
*/
public class demo6 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\ѧϰ\\Java��������");
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
