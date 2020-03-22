package fnashe;

import java.io.BufferedReader;
import java.io.FileReader;

/**  
* 文件名: zhazhii_demo.java 
* 作者：梓灏 
* 时间： 2019年1月9日 下午5:13:33 
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
 

	
	
	

 
