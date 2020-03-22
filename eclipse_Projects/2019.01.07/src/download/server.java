package download;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**  
* 文件名: servce.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午7:37:55 
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
					OutputStream out=new FileOutputStream("F:\\java基础班视频\\基础班到此结束（六天）\\2016.01.06网络编程\\day26\\video");
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
