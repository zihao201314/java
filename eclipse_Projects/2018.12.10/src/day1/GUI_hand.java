package day1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
	
public class GUI_hand {
public static void main(String[] args) {
	

	
	Frame a=new Frame("超级计算器");
	//a.setLayout(new FlowLayout(FlowLayout.LEFT,25,0));
	a.setLayout(new BorderLayout());
	
	Button b=new Button("上");
	a.add(b,BorderLayout.NORTH);
	Button c=new Button("下");
	a.add(c,BorderLayout.SOUTH);
	Button f=new Button("中");
	a.add(f,BorderLayout.CENTER);
	
	
	
	Panel z=new Panel();
	z.setLayout(new GridLayout(3,3));
	Button a1=new Button("1");
	Button a2=new Button("1");
	Button a3=new Button("1");
	Button a4=new Button("1");
	Button a5=new Button("1");
	Button a6=new Button("1");
	Button a7=new Button("1");
	Button a8=new Button("1");
	Button a9=new Button("1");
	z.add(a1);
	z.add(a2);
	z.add(a3);
	z.add(a4);
	z.add(a5);
	z.add(a6);
	z.add(a7);
	z.add(a8);
	z.add(a9);


	
	

	
	a.setVisible(true);//可见
	a.setSize(300, 300);
	a.setLocation(300, 600);
	
}
}
