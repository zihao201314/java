package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**  
* �ļ���: Demo8.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��3�� ����11:10:28 
*/
public class Demo8 {
public static void main(String[] args) throws IOException {
	File a=new File("F:\\ѧϰ\\\\Java��������\\777.txt");
	FileOutputStream b=new FileOutputStream(a,true);
	b.write("asdasdasdsad".getBytes());
}
}
