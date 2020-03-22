package Text3;

/**  
* 文件名: Play.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午1:58:48 
*/
public class Play implements Runnable{
public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println("玩游戏");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
}
