package day1;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;

import org.w3c.dom.events.MouseEvent;

public class LIsten_1218_1 implements MouseListener {

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO 自动生成的方法存根
		Random b=new Random();
		int x=b.nextInt(800);
		int y=b.nextInt(800);
		Button a=(Button)arg0.getSource();
		a.setBounds(x, y, 50, 50);
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	
	
		
		
	}


