package com.day0107;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**  
* 文件名: Send.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午4:01:21 
*/
public class Send {
public static void main(String[] args) throws IOException {
	DatagramSocket data =new DatagramSocket();
	byte [] buf ="王老C66esaduhf kjads filkasdhf asdhfadhsgfa unaldksj hfyadsiuyfoadinfbuadohsuhnfkiaesgjlsadkoimav;iyl花哦啊死啦花审题表略恩爱两口花阿乌尔擦 6".getBytes();
	DatagramPacket p=new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10086);
	data.send(p);
	data.close();
}
}
