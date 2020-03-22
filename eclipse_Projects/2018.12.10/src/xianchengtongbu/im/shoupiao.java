package xianchengtongbu.im;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 文件名: shoupiao.java 作者：梓灏 时间： 2018年12月24日 下午7:14:51
 */
public class shoupiao implements Runnable {
	private final ReentrantLock lock = new ReentrantLock();
	public static int num = 50;

	/**
	 * class X { private final ReentrantLock lock = new ReentrantLock(); // ...
	 * 
	 * public void m() { lock.lock(); // block until condition holds try { // ...
	 * method body } finally { lock.unlock() } } }
	 * 
	 */

	/**
	 * 
	 */

	public void run() {
		for (int i = 50; i > 0; i--) {
			
			one();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	private void one() {
		lock.lock();
		try {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "售出票" + num--);
				
			}
			// ... method body
		} finally {
			lock.unlock();

		}

	}
}
