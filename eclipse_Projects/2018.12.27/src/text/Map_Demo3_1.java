package text;

import java.util.HashMap;
import java.util.Map;

/**  
* 文件名: Map_Demo3.java 
* 作者：梓灏 
* 时间： 2018年12月28日 下午7:02:57 
* 功能：统计数组中每一个元素出现的個數
*/
public class Map_Demo3_1 {
public static void main(String[] args) {
	Map a=new HashMap();
	String b="aaabbbbcccccdddddd";
	char[]c=b.toCharArray();
	for (int i = 0; i < c.length; i++) {
	if (a.containsKey(c[i])) {
		    a.put(c[i], (Integer)a.get(c[i])+1);
			} else {
				a.put(c[i], 1);
			}
		}
	System.out.println(a);
	}
}


