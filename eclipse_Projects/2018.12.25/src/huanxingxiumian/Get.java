package huanxingxiumian;

/**  
* �ļ���: Get.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����11:28:50 
*/
public class Get implements Runnable{
private Money a;
public Get(Money a) {
	super();
	this.a=a;
}


	public void run() {
		for (int i = 0; i < 15; i++) {
			a.getmoney();
		}
		
	}

	
}
