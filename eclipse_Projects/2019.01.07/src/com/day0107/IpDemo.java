package com.day0107;

import java.net.InetAddress;

/**  
* �ļ���: IpDemo.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��7�� ����3:11:56 
*/
public class IpDemo {
	
		public static void main(String[] args){
			try {
				InetAddress a=InetAddress.getByName("www.sina.com");
				System.out.println(a);
				System.out.println(a.getHostName());
				System.out.println(a.getHostAddress());
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
