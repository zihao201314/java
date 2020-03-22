package huanxingxiumian;

/**  
* 文件名: Text.java 
* 作者：梓灏 
* 时间： 2018年12月25日 上午11:28:08 
*/
public class Text {
 public static void main(String[] args) {
	Money a=new Money(0.0);
	Set b=new Set(a);
	Get c=new Get(a);
	
	new Thread(b).start();
	new Thread(c).start();
	
}
}
