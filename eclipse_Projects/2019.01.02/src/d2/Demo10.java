package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**  
* �ļ���: Demo8.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��3�� ����11:10:28 
*/
public class Demo10 {
public static void main(String[] args) throws IOException {
	FileReader b= new FileReader("F:\\ѧϰ\\\\Java��������\\777.txt");
	char[] c=new char[5];
	int a=0;
	while((a= b.read(c))!= -1) {
		System.out.print(new String(c,0,a) );
	}
}
}
