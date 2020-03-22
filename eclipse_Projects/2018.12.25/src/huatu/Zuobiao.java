package huatu;

/**  
* 文件名: Zuobiao.java 
* 作者：梓灏 
* 时间： 2018年12月26日 下午5:52:16 
*/
public class Zuobiao {
	int x1;
	int y1;
	int x2;
	int y2;
	int style;
	/**
	 * 
	 */
	public Zuobiao(int a,int b,int c,int d,int e) {
     x1=a;y1=b;x2=c;y2=d;style=e;
   }

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
}
