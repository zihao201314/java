package 聊天室;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.table.TableColumn;

/**  
* 文件名: QQ.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午4:21:21 
*/
public class QQ {
public static void main(String[] args) {
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				DatagramSocket ds =new DatagramSocket();
			Scanner a=new Scanner(System.in );
			while(true) {
			String b=a.nextLine();
			if(b.equals(88)) {
				System.exit(0);
			}else {
			DatagramPacket p=new DatagramPacket(b.getBytes(), b.getBytes().length, InetAddress.getLocalHost(), 10086);
			ds.send(p);
			System.out.println("我发送的"+b);
			}
			} }catch (Exception e) {
				
			}
		}
	}).start();;
	
new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				DatagramSocket ds =new DatagramSocket(10010);
			DatagramPacket p=new DatagramPacket(new byte[1024*64], 1024*64);
			
			while(true) {
				ds.receive(p);
				System.out.println("我接收的"+p.getAddress().getHostAddress()+"----"+new String(p.getData(),0,p.getData().length));
			}
			 }catch (Exception e) {

			}
		}
	}).start();;
	
	
}
}
