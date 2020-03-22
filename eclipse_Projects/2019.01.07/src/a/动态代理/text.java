package a.动态代理;

import java.lang.reflect.Proxy;

/**  
* 文件名: text.java 
* 作者：梓灏 
* 时间： 2019年1月9日 下午8:27:55 
*/
public class text {
	public static void main(String[] args) {
		
		US a=new User();
		tool b=new tool(a);
		
		Object c=Proxy.newProxyInstance(a.getClass().getClassLoader(), a.getClass().getInterfaces(), b);
		  US d=(User)c;
		  d.add();
	}
}
