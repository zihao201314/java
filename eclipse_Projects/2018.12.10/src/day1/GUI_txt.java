package day1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;


public class GUI_txt {
	public static void main(String[] args) {
		Frame f = new Frame("������");
		f.setLayout(null);
		
		TextField tf = new TextField();
		Button b = new Button("7");
		
		//����ťb����¼��������������ס����ķ�����
		b.addActionListener(new MyActionListener(b,tf));
		
		//���������λ�úʹ�С
		tf.setBounds(15, 40, 220, 30);
		b.setBounds(15, 80, 220, 50);
		
		
		f.add(tf);
		f.add(b);
		
		f.setSize(250, 350);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		
		
	}
}
