package TimerDemo;

import java.util.Timer;
import java.util.TimerTask;

/**  
* 文件名: TimerDemo.java 
* 作者：梓灏 
* 时间： 2018年12月25日 下午2:46:04 
*/
public class TimerDemo {
public static void main(String[] args) {
	Timer a=new Timer();
	a.schedule(new TimerTask() {
		
		@Override
		public void run() {
		System.out.println("666");
			
		}
	}, 2000,1000);
}
}
