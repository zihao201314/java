package d2;

/**  
* 文件名: demo2.java 
* 作者：梓灏 
* 时间： 2019年1月2日 下午6:43:42 
*/
public class demo2 {
public static void main(String[] args) {
	System.out.println(demo2.aaa(7));
}

public static int aaa(int a) {
	if(a==0) {
		return 0;
	}else if(a==1) {
		return 1;
	}else {
		return aaa(a-1)+aaa(a-2);
	}
}
}
