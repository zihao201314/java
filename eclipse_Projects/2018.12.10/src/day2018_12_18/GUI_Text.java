
package day2018_12_18;


import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**  

* �ļ���: GUI_Text.java 

* ���ߣ���� 

* ʱ�䣺 2018��12��18�� ����3:26:03 

*/  
public class GUI_Text {
public static void main(String[] args) {
	Frame a=new Frame();
	Button b=new Button("����ѽ");
	ActionListener act=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		b.setLabel("������!");
			
		}
	};
	b.addActionListener(act);
	
	a.add(b);
	a.setVisible(true);
	a.setSize(500, 500);
	a.setLocationRelativeTo(null);
}
}
