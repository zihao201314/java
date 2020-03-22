package d3;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**  
* 文件名: ObjectOutPutStreamDemo.java 
* 作者：梓灏 
* 时间： 2019年1月5日 下午4:10:37 
*/
public class ObjectOutPutStreamDemo {
public static void main(String[] args) throws FileNotFoundException, IOException {
	ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("F:\\学习\\Java基础代码\\1234.txt"));
	User c=new User("奥帅", 123456);
	//User d=new User("奥di", 15523456);

	out.writeObject(c);
	//out.flush();
	//out.writeObject(d);
	out.close();
	}
}
