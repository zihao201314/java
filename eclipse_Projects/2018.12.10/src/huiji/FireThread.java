package huiji;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FireThread extends Thread{
	private Plane p;
	
	public FireThread(Plane p) {
		super();
		this.p = p;
	}


	@Override
	public void run() {
		//获得背景面板 飞机
		JPanel winPanel = p.getWinPanel();
		JButton plane = p.getPlane();
		//获得飞机的坐标
		int x = plane.getX();
		int y = plane.getY();
		//获得子弹的坐标
		x = x + 30;
		y = y - 10;
		JButton jb = new JButton();
		jb.setBounds(x, y, 10, 10);
		winPanel.add(jb);
		p.repaint();
		while(true){
			jb.setBounds(x, y=y-10, 10, 10);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
