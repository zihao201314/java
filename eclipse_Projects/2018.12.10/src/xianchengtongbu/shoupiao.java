package xianchengtongbu;

/**  
* 文件名: shoupiao.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午7:14:51 
*/
public class shoupiao extends Thread{

	public static int num=50;
	/**
	 * 
	 */
	public shoupiao(String s) {
      super(s);
	}

	public void run() {
		for(int i=50;i>0;i--) {
			one();		}
	}
	
	private void one() {
	synchronized (String.class) {
		if(num>0) {
			System.out.println(getName()+"售出票"+num--);
		}
	}
	}
	
}
