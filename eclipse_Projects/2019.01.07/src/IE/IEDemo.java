package IE;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**  
* �ļ���: IEDemo.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����8:13:25 
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
