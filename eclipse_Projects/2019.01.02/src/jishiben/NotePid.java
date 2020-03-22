package jishiben;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**  
* �ļ���: NotePid.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��3�� ����7:25:03 
*/
public class NotePid {
public static void main(String[] args) {
	Frame f=new Frame("���±�");
	f.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);}
	});
	
	TextArea ta=new TextArea();
	f.add(ta);
	MenuBar mb=new MenuBar();
	Menu file=new Menu("�ļ�");
	MenuItem open =new MenuItem("��");
	MenuItem save =new MenuItem("���Ϊ");
	
	
	open.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			FileDialog fd=new FileDialog(f,"��");
			fd.setVisible(true);
			if(fd.getDirectory()==null || fd.getFile()==null) {
				return;
			}
			try {
				FileInputStream fis = new FileInputStream(new File(fd.getDirectory(),fd.getFile()));
				byte[] b=new byte[1024];
				int len;
				while ((len=fis.read(b))!=-1) {
					ta.append(new String(b,0,len));
					
					
				}
			} catch (FileNotFoundException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			
		}
	});
	
	save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			FileDialog fd=new FileDialog(f,"���Ϊ",FileDialog.SAVE);
			fd.setVisible(true);
			if(fd.getDirectory()==null || fd.getFile()==null) {
				return;
			}
			File file=new File(fd.getDirectory(),fd.getFile());
			try {
				FileOutputStream fos=new FileOutputStream(file);
				String msg=ta.getText();
				fos.write(msg.getBytes());
			} catch (FileNotFoundException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			
		
	}});
	file.add(save);
	file.add(open);
	mb.add(file);
	f.setMenuBar(mb);
	
	
	
	
	
	
	
	f.setVisible(true);
	f.setSize(500, 500);
	f.setLocationRelativeTo(null);
}
}
