package day1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class GUI_1217 {
public static void main(String[] args) {
	Frame f=new Frame("³¬¼¶¼ÆËãÆ÷");
	f.setLayout(null);
	
	TextField tf=new TextField();
	Button b=new Button("777");

//	b.addActionListener(new LIsten_1217(b,tf));
	b.addActionListener(new LIsten_1217(tf));
	
	tf.setBounds(15, 50, 300, 30);
	b.setBounds(15, 200, 300, 30);

	f.add(tf);
	f.add(b);

	f.setSize(330, 330);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
}
}
