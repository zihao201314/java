package text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**  
* �ļ���: Map_Demo3.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��28�� ����7:02:57 
* ���ܣ�ͳ��������ÿһ��Ԫ�س��ֵĂ���
*/
public class Map_Demo3_2 {
public static void main(String[] args) {
	Map a=new HashMap();
	String b="aaabbbbcccccddddddeeffkkkttttttteeeeooooooo";
	for (int i = 0; i < b.length(); i++) {
	if (a.containsKey(b.charAt(i))) {
		    a.put(b.charAt(i), (Integer)a.get(b.charAt(i))+1);
			} else {
				a.put(b.charAt(i), 1);
			}
		}
	System.out.println(a);
	System.out.println(a.keySet());
	System.out.println(a.values());
	
	  Collection l=a.values();
	   
	    //����һ       
		//	int k=0;
		//	for (Object obj : l) {
		//		if ((int)obj>k) {
		//			k=(int)obj;
		//		}
		//	} 
		//	System.out.println(k);	
	  
	  
	  //������
		//   Object[] k=l.toArray();
		//   Arrays.sort(k);
		//   System.out.println(k[k.length - 1]);
	  
	  
	  	// ������
	   Object x=Collections.max(l);
	   
	   
	   //��ӡ�����������ַ��ʹ���
	   System.out.println(x);
	   Set y=a.entrySet();
	   for (Object object : y) {
		   Map.Entry h=( Map.Entry)object;
		if(h.getValue()==x) {
			System.out.println(h.getKey()+"--"+h.getValue());
		}
	}
	}
}


