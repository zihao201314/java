package day1;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{
	private Button b1;
	private TextField tf1;
	
	MyActionListener(Button b,TextField tf){
		this.b1 = b;
		this.tf1 = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("±ðMÎÒ£¡£¡£¡");
//		System.out.println(b1.getLabel());
		tf1.setText(b1.getLabel());
		
	}
}
