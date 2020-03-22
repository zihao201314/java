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
* 文件名: NotePid.java 
* 作者：梓灏 
* 时间： 2019年1月3日 下午7:25:03 
*/
public class NotePid {
public static void main(String[] args) {
	Frame f=new Frame("记事本");
	f.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);}
	});
	
	TextArea ta=new TextArea();
	f.add(ta);
	MenuBar mb=new MenuBar();
	Menu file=new Menu("文件");
	MenuItem open =new MenuItem("打开");
	MenuItem save =new MenuItem("另存为");
	
	
	open.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			FileDialog fd=new FileDialog(f,"打开");
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
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			
		}
	});
	
	save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			FileDialog fd=new FileDialog(f,"另存为",FileDialog.SAVE);
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
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
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
