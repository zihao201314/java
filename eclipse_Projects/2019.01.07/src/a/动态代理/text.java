package a.��̬����;

import java.lang.reflect.Proxy;

/**  
* �ļ���: text.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��9�� ����8:27:55 
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
