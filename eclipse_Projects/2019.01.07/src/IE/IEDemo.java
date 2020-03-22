package IE;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**  
* 文件名: IEDemo.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午8:13:25 
*/
public class IEDemo {
public static void main(String[] args) throws Exception{
	ServerSocket a=new ServerSocket(10086);
	Socket acc = a.accept();
	InputStream c = acc.getInputStream();
	byte[] b=new byte[1024];
	int len;
	while((len=c.read(b))!=-1) {
		System.out.println(new String(b,0,len));
	}
	
	}
}
