package day1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;


public class GUI_txt {
	public static void main(String[] args) {
		Frame f = new Frame("计算器");
		f.setLayout(null);
		
		TextField tf = new TextField();
		Button b = new Button("7");
		
		//给按钮b添加事件监听器（必须记住下面的方法）
		b.addActionListener(new MyActionListener(b,tf));
		
		//设置组件的位置和大小
		tf.setBounds(15, 40, 220, 30);
		b.setBounds(15, 80, 220, 50);
		
		
		f.add(tf);
		f.add(b);
		
		f.setSize(250, 350);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		
		
	}
}
