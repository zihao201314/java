package day1;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;

import org.w3c.dom.events.MouseEvent;

public class Listen_1218_2 implements KeyListener {

	
	@Override
	public void keyPressed(KeyEvent arg0) {
		JButton a=(JButton) arg0.getSource();
		int x=a.getX();
		int y=a.getY();
		
		int b=arg0.getKeyCode();

		switch (b) {
		case 37:
			x-=50;
			break;
		case 38:
			y-=50;
			break;
		case 39:
			x+=50;
			break;
		case 40:
			y+=50;
			break;

		default:
			break;
		}
		a.setBounds(x, y, 50, 50);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	}
	


