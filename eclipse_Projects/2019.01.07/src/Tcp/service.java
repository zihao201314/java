package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**  
* 文件名: servi.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午6:08:34 
*/
public class service {
	public static void main(String[] args) throws Exception {
		ServerSocket a=new ServerSocket(10086);
		
		Socket b=a.accept();
		
		OutputStream out =b.getOutputStream();
		out.write("777".getBytes());
		
		InputStream in=b.getInputStream();
		byte[] c=new byte[1024];
		System.out.println(new String(c,0,in.read(c)));
		a.close();
	}
}
