package Text3;

/**  
* �ļ���: Play.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����1:58:48 
*/
public class Play implements Runnable{
public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println("����Ϸ");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
}
