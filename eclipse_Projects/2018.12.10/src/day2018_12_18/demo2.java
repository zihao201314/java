package day2018_12_18;

import java.util.Random;

/**  
* 文件名: demo2.java 
* 作者：梓灏 
* 时间： 2018年12月19日 下午7:39:51 
*/

public class demo2 {
public static void main(String[] args) {
	long a=System.currentTimeMillis();
	System.out.println(Get(9));
	long b=System.currentTimeMillis();
	System.out.println(b-a);
}

public static String GetOne() {
	String a="qwertyuiopasdfghjklzxcvbnmASDFGHJKLZXCVBNMQWERTYUIOP123456789";
	Random b=new Random();
	int c=b.nextInt(a.length());
	char d=a.charAt(c);
	return d+"";
}

public static String Get(int times) {
	String a="";
	for (int i = 0; i < times; i++) {
		a+=GetOne();
	}
	return a;
}

}
