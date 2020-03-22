package Text3;

/**  
* 文件名: Text.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午1:59:05 
*/
public class Text {
 public static void main(String[] args) {
	 new Thread(new Music()).start();
	 new Thread(new Play()).start();
}
}
