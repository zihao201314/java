package text;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**  
* 文件名: Map_Demo.java 
* 作者：梓灏 
* 时间： 2018年12月27日 下午11:28:29 
*/
public class Map_Demo {
public static void main(String[] args) {
	Map a=new HashMap();
	a.put("张三", 11)	;
	a.put("李四", 12)	;
	a.put("王五", 13)	;
	a.put("赵柳", 14)	;
	System.out.println(a.get("张三"));
	System.out.println(a.keySet());
	System.out.println(a.size());
	System.out.println(a.values());
	System.out.println(a.isEmpty());
	System.out.println(a.containsKey("张三"));
	
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
