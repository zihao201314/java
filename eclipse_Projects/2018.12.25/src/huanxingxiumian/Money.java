package huanxingxiumian;

/**  
* �ļ���: Money.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����11:28:33 
*/
public class Money {
private double money;
private boolean yes=false;//false ��ʾûǮ

/**
 * 
 */
public Money(double a) {
money=a;

}
public synchronized void getmoney() {
	if(!yes) {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	if(money>=1000) {
		
		System.out.println("----------------->ȡǰ���"+money);
		money-=1000;
		System.out.println("----------------->ȡ�����"+money);
		
	}else {
		System.out.println("ûǮ");
	}
	this.notify();
	yes=false;
}

public synchronized void setmoney() {
	if(yes) {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	System.out.println("��ǰ���"+money);
	money+=1000;
	System.out.println("������"+money);
	this.notify();
	yes=true;
 }
}
