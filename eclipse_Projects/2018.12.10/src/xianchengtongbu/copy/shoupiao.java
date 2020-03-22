package xianchengtongbu.copy;

/**  
* 文件名: shoupiao.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午7:14:51 
*/
public class shoupiao extends Thread{

	public static int num=50;
	

	public void run() {
		for(int i=50;i>0;i--) {
			one();		}
	}
	
	private void one() {
	if(num>0) {
			System.out.println("售出票"+num--);
		}
	}
	
}
