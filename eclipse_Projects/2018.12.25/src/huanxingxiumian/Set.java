package huanxingxiumian;

/**  
* �ļ���: Set.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����11:28:43 
*/
public class Set implements Runnable{
private Money money;

	/**
 * 
 */
public Set(Money a) {
	super();
	money=a;
}

	public void run() {
		for (int i = 0; i < 15; i++) {
			money.setmoney();
		}
	
	}

}
