package xianchengtongbu.im;

/**  
* 文件名: Text.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午7:14:31 
*/
public class Text {
public static void main(String[] args) {
//	 Thread a=new Thread(new shoupiao());
//	 a.start();
	
	shoupiao a=new shoupiao();
	new Thread(a,"aaaa").start();
	new Thread(a,"bbbb").start();
	new Thread(a,"cccc").start();
	
}
}
