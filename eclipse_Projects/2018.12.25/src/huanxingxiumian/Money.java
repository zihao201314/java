package huanxingxiumian;

/**  
* 文件名: Money.java 
* 作者：梓灏 
* 时间： 2018年12月25日 上午11:28:33 
*/
public class Money {
private double money;
private boolean yes=false;//false 表示没钱

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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	if(money>=1000) {
		
		System.out.println("----------------->取前余额"+money);
		money-=1000;
		System.out.println("----------------->取后余额"+money);
		
	}else {
		System.out.println("没钱");
	}
	this.notify();
	yes=false;
}

public synchronized void setmoney() {
	if(yes) {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	System.out.println("存前余额"+money);
	money+=1000;
	System.out.println("存后余额"+money);
	this.notify();
	yes=true;
 }
}
