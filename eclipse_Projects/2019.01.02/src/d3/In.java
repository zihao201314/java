package d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**  
* 文件名: In.java 
* 作者：梓灏 
* 时间： 2019年1月5日 下午4:20:09 
*/
public class In {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream b=new ObjectInputStream(new FileInputStream("F:\\学习\\Java基础代码\\1234.txt"));
	//System.out.println(b.readObject());
	Object d=b.readObject();
	User e=(User) d;
	System.out.println(e.getName()+"------------"+e.getID());
	}
}
