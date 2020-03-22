package Text3;

/**  
* 文件名: Music.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午1:58:58 
*/
public class Music implements Runnable{

public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println("听音乐");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
}
