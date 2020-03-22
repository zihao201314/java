package d2;

/**  
* 文件名: demo3.java 
* 作者：梓灏 
* 时间： 2019年1月2日 下午6:47:59 
* 递归算阶乘
*/
public class demo3 {
public static void main(String[] args) {
	System.out.println(demo3.n(15));
}
	public static int n(int a) {
		if(a==0) {
			return 0;
		}if (a==1) {
			return 1;
		} else {
       return a*(n(a-1));
		}
}
}