package com.day0107;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**  
* �ļ���: Send.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����4:01:21 
*/
public class Send {
public static void main(String[] args) throws IOException {
	DatagramSocket data =new DatagramSocket();
	byte [] buf ="����C66esaduhf kjads filkasdhf asdhfadhsgfa unaldksj hfyadsiuyfoadinfbuadohsuhnfkiaesgjlsadkoimav;iyl��Ŷ��������������Զ������ڻ����ڶ��� 6".getBytes();
	DatagramPacket p=new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10086);
	data.send(p);
	data.close();
}
}
