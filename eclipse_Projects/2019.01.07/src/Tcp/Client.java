package Tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**  
* �ļ���: Client.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����6:11:40 
*/
public class Client {
public static void main(String[] args) throws Exception {
	
	Socket a=new Socket(InetAddress.getLocalHost(), 10086);
	
	InputStream in=a.getInputStream();
	byte[] c=new byte[1024];
	System.out.println(new String(c,0,in.read(c)));
	
	
	OutputStream b=a.getOutputStream();
	
	byte[] d="666".getBytes();
	b.write(d);
	a.close();
}
}
