package fnashe;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**  
* �ļ���: Arrlist.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��9�� ����7:33:41 
*/
public class Arrlist {
public static void main(String[] args) throws Exception {
	List<Integer> a=new ArrayList<>();
	a.add(123);
	a.add(456);
	Class b=Class.forName("java.util.ArrayList");
	Method me = b.getMethod("add", Object.class);
	me.invoke(a, "aaa");
	System.out.println(a);
}
}
