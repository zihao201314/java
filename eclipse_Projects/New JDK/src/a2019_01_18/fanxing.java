package a2019_01_18;

import java.util.ArrayList;
import java.util.List;

/**  
* 文件名: fanxing.java 
* 作者：梓灏 
* 时间： 2019年1月8日 下午4:03:46 
*/
public class fanxing {
	public static void main(String[] args) {
		
		add(1,2,3,4,5,6,7,8,9);
	}

	/**
	 * 
	 */
	private static void add(int a,int b,int... c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println("----------"+c.length);
		
	}
	
}
