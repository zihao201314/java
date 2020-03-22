
package day2018_12_18;


import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**  

* 文件名: GUI_Text.java 

* 作者：梓灏 

* 时间： 2018年12月18日 下午3:26:03 

*/  
public class GUI_Text {
public static void main(String[] args) {
	Frame a=new Frame();
	Button b=new Button("点我呀");
	ActionListener act=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		b.setLabel("点你啦!");
			
		}
	};
	b.addActionListener(act);
	
	a.add(b);
	a.setVisible(true);
	a.setSize(500, 500);
	a.setLocationRelativeTo(null);
}
}
