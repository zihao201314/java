package ������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.table.TableColumn;

/**  
* �ļ���: QQ.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����4:21:21 
*/
public class QQ1 {
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
			DatagramPacket p=new DatagramPacket(b.getBytes(), b.getBytes().length, InetAddress.getLocalHost(), 10010);
			ds.send(p);
			System.out.println("�����͵�"+b);
			}
			} }catch (Exception e) {

			}
		}
	}).start();;
	
new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				DatagramSocket ds =new DatagramSocket(10086);
			DatagramPacket p=new DatagramPacket(new byte[1024*64], 1024*64);
			
			while(true) {
				ds.receive(p);
				System.out.println("�����յ�"+p.getAddress().getHostAddress()+"----"+new String(p.getData(),0,p.getData().length));
			}
			 }catch (Exception e) {

			}
		}
	}).start();;
	
	
}
}
