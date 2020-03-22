package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**  
* �ļ���: Copy.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��5�� ����6:27:51 
*/
public class Copy {
public static void main(String[] args) throws Exception {
	work1("E:\\WallPaper\\134925.jpg","C:\\Users\\16685\\Desktop\\1.jpg");
	//work2("F:\\java��������Ƶ\\��7�죩�����\\13���\\10.txt","C:\\Users\\16685\\Desktop\\1.txt");
	
}

//�����ļ����͵Ŀ���
private static void work1(String copyof, String copyto) throws Exception {
	InputStream in =new FileInputStream(copyof);
	OutputStream out=new FileOutputStream(copyto);
	byte[] b=new byte[1024];
	int len;
	while ((len=in.read(b))!=-1) {
		out.write(b, 0, len);
		
	}
	in.close();
	out.close();
}

//�ı����͵Ŀ���
@SuppressWarnings("unused")
private static void work2(String copyof, String copyto) throws Exception {
	Reader in = new FileReader(copyof);
	Writer out =new FileWriter(copyto);
	char []b=new char[1024];
	int len;
	while((len=in.read(b))!=-1) {
		out.write(b, 0, len);
	}
	in.close();
	out.close();
}



}

