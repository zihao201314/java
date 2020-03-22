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
	/**�������*/
	private JPanel winPanel;   
	/**�ɻ�*/
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
	 * ���ɻ�����ƶ����¼������������¼�������
	 * 		û��һ�Σ����򰴼��ķ����ƶ�һ����λ
	 * 		��һ����Ե�ֵ������ÿһ���ƶ�֮ǰ����õ���ǰ������
	 */
	private void addMoveListener(){
		plane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//��õ�ǰ������
				int x = plane.getX();
				int y = plane.getY();
				// ��÷��� ��������  37  38  39  40
				int way = e.getKeyCode();
				switch(way){
					case 37 : x = x-SIZE;break;
					case 38 : y = y-SIZE;break;
					case 39 : x = x+SIZE;break;
					case 40 : y = y+SIZE;break;
					case 32 : 
						//�����ӵ�
//						System.out.println("�ӵ�");
						//�˴���thisָ���ǵ�ǰ����������ڲ������
						new FireThread(Plane.this).start();
					break;
				}
				//���÷ɻ���������
				plane.setBounds(x, y, SIZE, SIZE);
			}
		});
		
	}
	
	/**
	 * ��ʼ���ɻ�
	 * 		�ɻ�����winPanel����ɡ�����
	 * 		�� �����ɻ�����
	 * 		�� ���ô�С λ��   ---�� winPanel�еĲ��ֱ������
	 * 		�� ����һ������ͼƬ
	 * 		�� ��ӵ�winPanel��ȥ
	 */
	private void initPlane(){
//		Icon icon = new ImageIcon("D:\\20151127\\javaseworkspace\\day17\\image\\s.png");
		Icon icon = new ImageIcon("huiji\\s.png");
		plane = new JButton(icon);
		plane.setBounds(350, 580, SIZE, SIZE);
		winPanel.add(plane);
	}
	
	/**
	 * ��ʼ���������
	 * 		�� ��������
	 * 		�� ���ñ�����ɫ
	 * 		�� ��ղ���
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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ر�
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
