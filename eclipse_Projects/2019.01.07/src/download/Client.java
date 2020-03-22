package download;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**  
* 文件名: Client.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午7:51:22 
*/
public class Client {
public static void main(String[] args) throws Exception{
	System.out.println("清楚输入上传的文件路径");
	Scanner a=new Scanner(System.in);
	String b=a.nextLine();
	Socket c=new Socket(InetAddress.getLocalHost(), 10086);
	OutputStream out = c.getOutputStream();
	InputStream in=new FileInputStream(b);
	byte[] d=new byte[1024];
	int len;
	while((len=in.read(d))!=-1) {
		out.write(d, 0, len);
	}
	in.close();
	out.close();
}
}
