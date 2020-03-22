package text;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
 
@SuppressWarnings("serial")
public class Cardioid extends JFrame implements Runnable {
 
	// ������ش��ڴ�С
	public static final int GAME_WIDTH = 500;
	public static final int GAME_HEIGHT = 500;
	// ��ȡ��Ļ���ڴ�С
	public static final int WIDTH = Toolkit.getDefaultToolkit()
			.getScreenSize().width;
	public static final int HEIGHT = Toolkit.getDefaultToolkit()
			.getScreenSize().height;
 
	public Cardioid() {
		// ���ô��ڱ���
		this.setTitle("��������");
		// ���ô��ڳ�ʼλ��
		this.setLocation((WIDTH - GAME_WIDTH) / 2, (HEIGHT - GAME_HEIGHT) / 2);
		// ���ô��ڴ�С
		this.setSize(GAME_WIDTH, GAME_HEIGHT);
		// ���ñ���ɫ
		this.setBackground(Color.BLACK);
		// ���ô��ڹرշ�ʽ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô�����ʾ
		this.setVisible(true);
	}
 
	@Override
	public void paint(Graphics g) {
		
		double x, y, r;
		Image OffScreen = createImage(GAME_WIDTH, GAME_HEIGHT);
		Graphics drawOffScreen = OffScreen.getGraphics();
 
		for (int i = 0; i < 90; i++) {
			for (int j = 0; j < 90; j++) {
				r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 18;
				x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i)
						+ GAME_WIDTH / 2;
				y = -r * Math.sin(Math.PI / 45 * j) + GAME_HEIGHT / 4;
				
				//���û�����ɫ
				drawOffScreen.setColor(Color.PINK);
				// ������Բ
				drawOffScreen.fillOval((int) x, (int) y, 2, 2);
			}
			// ����ͼƬ
			g.drawImage(OffScreen, 0, 0, this);
		}
	}
 
	public static void main(String[] args) {
		Cardioid demo = new Cardioid();
		Thread t = new Thread(demo);
		t.start();
	}
 
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				this.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
 
	}
}