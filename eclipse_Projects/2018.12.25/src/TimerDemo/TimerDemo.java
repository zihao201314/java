package TimerDemo;

import java.util.Timer;
import java.util.TimerTask;

/**  
* �ļ���: TimerDemo.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����2:46:04 
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
