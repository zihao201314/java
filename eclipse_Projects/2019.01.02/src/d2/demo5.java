package d2;

import java.io.File;
import java.io.IOException;

/**  
* �ļ���: demo1.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:20:06 
*/
public class demo5 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\ѧϰ\\Java��������");
		
		String[] d=a.list(new nameguolv());
		for (String s : d) {
			System.out.println(s);
		}
		
	}
	
}
