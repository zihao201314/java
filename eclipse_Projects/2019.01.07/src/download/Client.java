package download;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**  
* �ļ���: Client.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����7:51:22 
*/
public class Client {
public static void main(String[] args) throws Exception{
	System.out.println("��������ϴ����ļ�·��");
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
