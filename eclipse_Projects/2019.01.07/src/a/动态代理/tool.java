package a.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**  
* �ļ���: tool.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��9�� ����8:22:41 
*/
public class tool implements InvocationHandler{

	private Object a;
	public tool (Object a) {
		this.a=a;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("����");
		method.invoke(a, args);
		System.out.println("��־");
		return null;
	}

}
