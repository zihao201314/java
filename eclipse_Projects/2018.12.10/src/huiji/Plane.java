package huiji;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Plane extends JFrame{
	/**背景面板*/
	private JPanel winPanel;   
	/**飞机*/
	private JButton plane;
	public static final int SIZE = 70;
	
	
	
	/**
	 * @return the winPanel
	 */
	public JPanel getWinPanel() {
		return winPanel;
	}

	/**
	 * @return the plane
	 */
	public JButton getPlane() {
		return plane;
	}

	/**
	 * 给飞机添加移动的事件监听（键盘事件监听）
	 * 		没按一次，（向按键的方向）移动一个身位
	 * 		是一个相对的值，所以每一次移动之前必须得到当前的坐标
	 */
	private void addMoveListener(){
		plane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//获得当前的坐标
				int x = plane.getX();
				int y = plane.getY();
				// 获得方向 左上右下  37  38  39  40
				int way = e.getKeyCode();
				switch(way){
					case 37 : x = x-SIZE;break;
					case 38 : y = y-SIZE;break;
					case 39 : x = x+SIZE;break;
					case 40 : y = y+SIZE;break;
					case 32 : 
						//发射子弹
//						System.out.println("子弹");
						//此处的this指的是当前的这个匿名内部类对象
						new FireThread(Plane.this).start();
					break;
				}
				//设置飞机的新坐标
				plane.setBounds(x, y, SIZE, SIZE);
			}
		});
		
	}
	
	/**
	 * 初始化飞机
	 * 		飞机放在winPanel上面飞。。。
	 * 		① 创建飞机对象
	 * 		② 设置大小 位置   ---》 winPanel中的布局必须清空
	 * 		③ 设置一个背景图片
	 * 		④ 添加到winPanel中去
	 */
	private void initPlane(){
//		Icon icon = new ImageIcon("D:\\20151127\\javaseworkspace\\day17\\image\\s.png");
		Icon icon = new ImageIcon("huiji\\s.png");
		plane = new JButton(icon);
		plane.setBounds(350, 580, SIZE, SIZE);
		winPanel.add(plane);
	}
	
	/**
	 * 初始化背景面板
	 * 		① 创建对象
	 * 		② 设置背景颜色
	 * 		③ 清空布局
	 */
	private void initWinPanel(){
		winPanel = new JPanel();
		winPanel.setBackground(Color.CYAN);
		winPanel.setLayout(null);
		this.add(winPanel);
	}
	
	public Plane(){
		initWinPanel();
		initPlane();
		addMoveListener();
		
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
