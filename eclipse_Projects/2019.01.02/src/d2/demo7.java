package d2;

import java.io.File;
import java.io.IOException;

/**  
* �ļ���: demo1.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:20:06 
* ��ӡ�ļ���������
*/
public class demo7 {
	public static void main(String[] args) throws IOException {
		File a=new File("F:\\ѧϰ\\Java��������");
		for (String s : a.list()) {
			System.out.println(s);
		}
		}
}
