package d3;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**  
* �ļ���: ObjectOutPutStreamDemo.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��5�� ����4:10:37 
*/
public class ObjectOutPutStreamDemo {
public static void main(String[] args) throws FileNotFoundException, IOException {
	ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("F:\\ѧϰ\\Java��������\\1234.txt"));
	User c=new User("��˧", 123456);
	//User d=new User("��di", 15523456);

	out.writeObject(c);
	//out.flush();
	//out.writeObject(d);
	out.close();
	}
}
