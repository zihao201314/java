package text;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**  
* �ļ���: Map_Demo.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��27�� ����11:28:29 
*/
public class Map_Demo {
public static void main(String[] args) {
	Map a=new HashMap();
	a.put("����", 11)	;
	a.put("����", 12)	;
	a.put("����", 13)	;
	a.put("����", 14)	;
	System.out.println(a.get("����"));
	System.out.println(a.keySet());
	System.out.println(a.size());
	System.out.println(a.values());
	System.out.println(a.isEmpty());
	System.out.println(a.containsKey("����"));
	
	System.out.println(a.hashCode());
    System.out.println(a.entrySet());
    
    Set b=a.entrySet();
    System.out.println("----"+b);
	for (Object object : b) {
		Map.Entry c=(Map.Entry)object;
		System.out.println(c.getKey()+"---"+c.getValue());
	}
    
	Set d=a.keySet();
	for (Object object : d) {
		System.out.println(object+"===="+a.get(object));
	}
    
}
}
