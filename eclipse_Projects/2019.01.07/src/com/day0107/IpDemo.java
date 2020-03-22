package com.day0107;

import java.net.InetAddress;

/**  
* 文件名: IpDemo.java 
* 作者：梓灏 
* 时间： 2019年1月7日 下午3:11:56 
*/
public class IpDemo {
	
		public static void main(String[] args){
			try {
				InetAddress a=InetAddress.getByName("www.sina.com");
				System.out.println(a);
				System.out.println(a.getHostName());
				System.out.println(a.getHostAddress());
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
