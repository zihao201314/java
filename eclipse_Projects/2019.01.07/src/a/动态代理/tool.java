package a.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**  
* 文件名: tool.java 
* 作者：梓灏 
* 时间： 2019年1月9日 下午8:22:41 
*/
public class tool implements InvocationHandler{

	private Object a;
	public tool (Object a) {
		this.a=a;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("教研");
		method.invoke(a, args);
		System.out.println("日志");
		return null;
	}

}
