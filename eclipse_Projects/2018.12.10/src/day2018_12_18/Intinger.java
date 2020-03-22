package day2018_12_18;

/**  
* 文件名: Intinger.java 
* 作者：梓灏 
* 时间： 2018年12月19日 下午3:26:22 
*/
public class Intinger {
 public static void main(String[] args) {
	 long a=System.currentTimeMillis();
	 String c="";
	for (int i = 1; i < 100000; i++) {
		c += i;	
		c+="+";
  
}
	   long b=System.currentTimeMillis();   
	     System.out.println(b-a);
 }
 }
