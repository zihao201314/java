package day1;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LIsten_1217 implements ActionListener {

	
	/*
	 * 	private Button b1;
	private TextField tf1;
	
	MyActionListener(Button b,TextField tf){
		this.b1 = b;
		this.tf1 = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("±ðMÎÒ£¡£¡£¡");
		System.out.println(b1.getLabel());
		tf1.setText(b1.getLabel());
		
	 */

	private TextField b1;
	LIsten_1217(TextField b){
	
		this.b1=b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object a=e.getSource();
		if(a instanceof Button) {
			b1.setText(((Button)a).getLabel());
		}
	
		
		
	}

}
