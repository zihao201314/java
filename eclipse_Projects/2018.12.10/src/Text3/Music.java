package Text3;

/**  
* �ļ���: Music.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����1:58:58 
*/
public class Music implements Runnable{

public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println("������");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
}
