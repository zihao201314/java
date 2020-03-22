package com.day0107;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**  
* 文件名: Receive.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午4:11:33 
*/
public class Receive {
public static void main(String[] args) throws Exception {
	DatagramSocket a=new DatagramSocket(10086);
	byte[] b=new byte[1024];		
	DatagramPacket p=new DatagramPacket(b, b.length);
	a.receive(p);
	System.out.println(p.getAddress()+"----"+new String(p.getData(),0,p.getLength()));
	a.close();
}
}
