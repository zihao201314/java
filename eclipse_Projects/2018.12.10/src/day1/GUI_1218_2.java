package day1;

import java.awt.Frame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUI_1218_2 {
public static void main(String[] args) {
	Frame f=new Frame("超级计算器");
	f.setLayout(null);
	
	//TextField tf=new TextField();
	Icon a=new ImageIcon("C:\\360安全浏览器下载\\timg.jpg");
	JButton b=new JButton(a);
	
//	b.addActionListener(new LIsten_1217(b,tf));
	b.addKeyListener(new Listen_1218_2());
	
	//tf.setBounds(15, 50, 300, 30);
	b.setBounds(400,700, 50,50);

//	f.add(tf);
	f.add(b);

	f.setSize(800,800);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
}
}
