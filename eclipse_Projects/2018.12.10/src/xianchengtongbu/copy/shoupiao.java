package xianchengtongbu.copy;

/**  
* �ļ���: shoupiao.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����7:14:51 
*/
public class shoupiao extends Thread{

	public static int num=50;
	

	public void run() {
		for(int i=50;i>0;i--) {
			one();		}
	}
	
	private void one() {
	if(num>0) {
			System.out.println("�۳�Ʊ"+num--);
		}
	}
	
}
