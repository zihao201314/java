package xiancheng;

/**  
* 文件名: a.java 
* 作者：梓灏 
* 时间： 2018年12月24日 下午8:50:35 
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
	/* （非 Javadoc）
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
	Thread C=new Thread();
	C.setDaemon(false);
	System.out.println("ccccccccccc"+C.isDaemon());
	}
}