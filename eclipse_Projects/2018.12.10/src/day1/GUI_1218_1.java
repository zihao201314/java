package day1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class GUI_1218_1 {
public static void main(String[] args) {
	Frame f=new Frame("超级计算器");
	f.setLayout(null);
	
	//TextField tf=new TextField();
	Button b=new Button("点我呀");

//	b.addActionListener(new LIsten_1217(b,tf));
	b.addMouseListener(new LIsten_1218_1());
	
	//tf.setBounds(15, 50, 300, 30);
	b.setBounds(15, 200, 50, 50);

//	f.add(tf);
	f.add(b);

	f.setSize(330, 330);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
}
}
