package d2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**  
* �ļ���: demo1.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:20:06 
*/
public class demo1 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\ѧϰ\\Java��������\\666.txt");
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
