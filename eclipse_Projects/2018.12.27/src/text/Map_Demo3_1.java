package text;

import java.util.HashMap;
import java.util.Map;

/**  
* �ļ���: Map_Demo3.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��28�� ����7:02:57 
* ���ܣ�ͳ��������ÿһ��Ԫ�س��ֵĂ���
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


