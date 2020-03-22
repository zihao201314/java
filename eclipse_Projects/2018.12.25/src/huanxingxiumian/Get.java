package huanxingxiumian;

/**  
* 文件名: Get.java 
* 作者：梓灏 
* 时间： 2018年12月25日 上午11:28:50 
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
