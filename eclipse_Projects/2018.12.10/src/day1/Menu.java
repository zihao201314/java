package day1;
/**
 * 九宫格鼠标移上变色加边框
 */
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;

public class Menu {
public static void main(String[] args) {
	Frame f=new Frame();
	f.setLayout(new GridLayout(3, 3));
	f.addWindowListener(new Menu_2());
	for (int i = 1; i <=9; i++) {
		JButton b=new JButton(i+"");	
		f.add(b);
		b.addMouseListener(new Menu_1());
		
	}
	
	
	
	f.setSize(800,800);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
}
}
