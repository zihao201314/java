package day1;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

public class GUI_wangge {
public static void main(String[] args) {
	Frame a=new Frame("超级计算器");
	//a.setLayout(new FlowLayout(FlowLayout.LEFT,25,0));
	a.setLayout(new GridLayout(3,4,15,15));
	Button b=new Button("上");
	a.add(b);
	Button c=new Button("下");
	a.add(c);
	Button d=new Button("左");
	a.add(d);
	Button e=new Button("右");
	a.add(e);
	Button f=new Button("中");
	a.add(f);
	
	a.setPreferredSize(new Dimension(100,100) );
	b.setPreferredSize(new Dimension(100,100) );
	c.setPreferredSize(new Dimension(100,100) );
	d.setPreferredSize(new Dimension(100,100) );
	e.setPreferredSize(new Dimension(100,100) );
	a.setVisible(true);//可见
	a.setSize(300, 300);
	a.setLocation(300, 600);
	
}
}
