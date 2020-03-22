package xianchengtongbu.im;

import java.util.concurrent.locks.ReentrantLock;

/**
 * �ļ���: shoupiao.java ���ߣ���� ʱ�䣺 2018��12��24�� ����7:14:51
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	private void one() {
		lock.lock();
		try {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "�۳�Ʊ" + num--);
				
			}
			// ... method body
		} finally {
			lock.unlock();

		}

	}
}
