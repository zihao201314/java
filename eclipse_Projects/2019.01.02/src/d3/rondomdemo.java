package d3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**  
* �ļ���: rondomdemo.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��5�� ����5:16:22 
*/
public class rondomdemo {
public static void main(String[] args) throws Exception {
	RandomAccessFile a=new RandomAccessFile("F:\\ѧϰ\\Java��������\\12345.txt", "rw");
	System.out.println(a.getFilePointer());
	a.writeChars("����ǰ");
	System.out.println(a.getFilePointer());
	a.seek(4);
	System.out.println(a.getFilePointer());
	System.out.println(a.readChar());
	System.out.println(a.getFilePointer());
}
}
