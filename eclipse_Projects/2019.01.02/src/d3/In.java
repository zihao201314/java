package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**  
* �ļ���: In.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��5�� ����4:20:09 
*/
public class In {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream b=new ObjectInputStream(new FileInputStream("F:\\ѧϰ\\Java��������\\1234.txt"));
	//System.out.println(b.readObject());
	Object d=b.readObject();
	User e=(User) d;
	System.out.println(e.getName()+"------------"+e.getID());
	}
}
