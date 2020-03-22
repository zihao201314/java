package look;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class a
  {
        @SuppressWarnings("deprecation")
		public static void main(String[] args)
        {
             Frame   f = new Frame("2010-7-6");
             f.setSize(600, 400);
             f.setLocation(100, 100);
             f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);          
                }
             });
             Button btn1 = new Button("btn1");
             btn1.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e)
                    {
                        JOptionPane.showMessageDialog(null, e.getPoint().toString());
                    }
             });
 
             f.setLayout(new FlowLayout());
               f.add(btn1);
             f.show();
 
         }
        }
