package xiancheng;

/**  
* �ļ���: a.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����8:50:35 
*/
public class a {
	public static void main(String[] args) {
		Thread b=new B();
		System.out.println(b.isDaemon());
		b.setDaemon(true);
	
		System.out.println("bbbbbbbbb"+b.isDaemon());
		b.start();
		}

}

class B extends Thread{
	/* ���� Javadoc��
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
	Thread C=new Thread();
	C.setDaemon(false);
	System.out.println("ccccccccccc"+C.isDaemon());
	}
}