package huanxingxiumian;

/**  
* 文件名: Set.java 
* 作者：梓灏 
* 时间： 2018年12月25日 上午11:28:43 
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
