package download;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**  
* �ļ���: servce.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����7:37:55 
*/
public class server {
	public static void main(String[] args) throws Exception {
		ServerSocket a=new ServerSocket(10086);
		while(true) {
			Socket accept = a.accept();
			
			new Thread(new Runnable() {
				
			
				@Override
				public void run() {
				try {
					OutputStream out=new FileOutputStream("F:\\java��������Ƶ\\�����ൽ�˽��������죩\\2016.01.06������\\day26\\video");
					InputStream in= accept.getInputStream();
					byte[] b=new byte[1024];
					int len;
					while ((len=in.read(b))!=-1) {
						out.write(b , 0 , len);
					}
					out.close();
					accept.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
				
					
				}
				
					
				}
			}).start();;
		}
	}

}
