package fnashe;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**  
* 文件名: Arrlist.java 
* 作者：梓灏 
* 时间： 2019年1月9日 下午7:33:41 
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
