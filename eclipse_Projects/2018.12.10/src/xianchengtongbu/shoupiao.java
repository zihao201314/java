package xianchengtongbu;

/**  
* �ļ���: shoupiao.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����7:14:51 
*/
public class shoupiao extends Thread{

	public static int num=50;
	/**
	 * 
	 */
	public shoupiao(String s) {
      super(s);
	}

	public void run() {
		for(int i=50;i>0;i--) {
			one();		}
	}
	
	private void one() {
	synchronized (String.class) {
		if(num>0) {
			System.out.println(getName()+"�۳�Ʊ"+num--);
		}
	}
	}
	
}
