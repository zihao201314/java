package fnashe;

import java.io.BufferedReader;
import java.io.FileReader;

/**  
* �ļ���: zhazhii_demo.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��9�� ����5:13:33 
*/
public class zhazhii_demo {
public static void main(String[] args) throws Exception {
	zhazhiji a=new zhazhiji();
	a.zhazhi(new juzi());
	BufferedReader q=new BufferedReader(new FileReader("1.txt"));
	Class clazz = Class.forName(q.readLine());
	
	shuiguo e=(shuiguo) clazz.newInstance();
	a.zhazhi(e);
	
	Class clazz1 = Class.forName(q.readLine());
	shuiguo e1=(shuiguo) clazz1.newInstance();
	a.zhazhi(e1);
	}
	
}
 

	
	
	

 
