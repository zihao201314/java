package huatu;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

/**  
* �ļ���: chuangti.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��26�� ����5:08:53 
*/
public class chuangti extends JFrame{
	
	private ArrayList<Zuobiao> line =new ArrayList<Zuobiao>();	//����һ�����Դ�� ����ƶ���������� �ļ��Ͽ��
	private int style;   // �ж�������ͼ�� 1����ֱ�ߣ�2������Σ�3������Բ
	int x1;             //�ĸ�int�������Ķ�λ
	int y1;          
	int x2;
	int y2;
	    //���ƴ��壬ÿ�δ򿪣���ʾ���������»��ƣ����������for�Ƕ�֮ǰ���Ƶ�ͼ�ε��Զ����»���
		public void paint(Graphics g) {
		super.paint(g);
		for (Zuobiao e : line) {
			
			// �ж�������ͼ�� 1����ֱ�ߣ�2������Σ�3������Բ
			if(e.getStyle()==1) {
			g.drawLine(e.getX1(), e.getY1(), e.getX2(), e.getY2());
			// �ж�������ͼ�� 1����ֱ�ߣ�2������Σ�3������Բ
		}else if(e.getStyle()==2) {
			// �ж����ĸ������϶�����Ӧ��ȷ�������￪ʼ��
			if(e.getX1()>e.getX2()&&e.getY1()>e.getY2()) {
        		g.drawRect(e.getX2(), e.getY2(), -(e.getX2()-e.getX1()), -(e.getY2()-e.getY1()));
        		
        	}else if(e.getX1()>e.getX2()&&e.getY1()<e.getY2()) {
        		g.drawRect(e.getX2(), e.getY1(), -(e.getX2()-e.getX1()), (e.getY2()-e.getY1()));
        		
        	}else if(e.getX1()<e.getX2()&&e.getY1()>e.getY2()) {
        		
        		g.drawRect(e.getX1(), e.getY2(), (e.getX2()-e.getX1()), -(e.getY2()-e.getY1()));
        	}else {
        		
        		g.drawRect(e.getX1(), e.getY1(), (e.getX2()-e.getX1()), (e.getY2()-e.getY1()));
        	}
        }
			// �ж�������ͼ�� 1����ֱ�ߣ�2������Σ�3������Բ
		else {
			// �ж����ĸ������϶�����Ӧ��ȷ�������￪ʼ��
			if(e.getX1()>e.getX2()&&e.getY1()>e.getY2()) {
        		g.drawOval(e.getX2(), e.getY2(), -(e.getX2()-e.getX1()), -(e.getY2()-e.getY1()));
        		
        	}else if(e.getX1()>e.getX2()&&e.getY1()<e.getY2()) {
        		g.drawOval(e.getX2(), e.getY1(), -(e.getX2()-e.getX1()), (e.getY2()-e.getY1()));
        		
        	}else if(e.getX1()<e.getX2()&&e.getY1()>e.getY2()) {
        		
        		g.drawOval(e.getX1(), e.getY2(), (e.getX2()-e.getX1()), -(e.getY2()-e.getY1()));
        	}else {
        		
        		g.drawOval(e.getX1(), e.getY1(), (e.getX2()-e.getX1()), (e.getY2()-e.getY1()));
        	}
			
		}
		}
		}
		//�����������
	private void jianting() {
		
		
		this.addMouseListener(new MouseAdapter() {
			
			//����
			public void mousePressed(MouseEvent e) {	
				
				x1=e.getX();
				y1=e.getY();
			}
			//�ͷ�
			public void mouseReleased(MouseEvent e) {
				
				x2=e.getX();
				y2=e.getY();
			
		        /**
                                                  * �ж�������ͼ��
                             * 1����ֱ�ߣ�2������Σ�3������Բ
                */
				if(style==1) {
		        	chuangti.this.getGraphics().drawLine(x1, y1, x2, y2);
		        }
				
		        /**
		         	* �ж�������ͼ��
		         		* 1����ֱ�ߣ�2������Σ�3������Բ
                */
				
				else if(style==2) {
		        	/**
		        	 * �ж����ĸ������϶�����Ӧ��ȷ�������￪ʼ��
		        	 */
		        	if(x1>x2&&y1>y2) {
		        		chuangti.this.getGraphics().drawRect(x2, y2, -(x2-x1), -(y2-y1));
		        		
		        	}else if(x1>x2&&y1<y2) {
		        		chuangti.this.getGraphics().drawRect(x2, y1, -(x2-x1), (y2-y1));
		        		
		        	}else if(x1<x2&&y1>y2) {
		        		
		        		chuangti.this.getGraphics().drawRect(x1, y2, (x2-x1), -(y2-y1));
		        	}else {
		        		
		        		chuangti.this.getGraphics().drawRect(x1, y1, (x2-x1), (y2-y1));
		        	}
		        }
		        /**
		                         * �ж�������ͼ��
		                         * 1����ֱ�ߣ�2������Σ�3������Բ
		         */
		        else if(style==3){
		        	/**
		        	 * �ж����ĸ������϶�����Ӧ��ȷ�������￪ʼ��
		        	 */
		        	
		        	if(x1>x2&&y1>y2) {
		        		chuangti.this.getGraphics().drawOval(x2, y2, -(x2-x1), -(y2-y1));
		        		
		        	}else if(x1>x2&&y1<y2) {
		        		chuangti.this.getGraphics().drawOval(x2, y1, -(x2-x1), (y2-y1));
		        		
		        	}else if(x1<x2&&y1>y2) {
		        		
		        		chuangti.this.getGraphics().drawOval(x1, y2, (x2-x1), -(y2-y1));
		        	}else {
		        		
		        		chuangti.this.getGraphics().drawOval(x1, y1, (x2-x1), (y2-y1));
		        	}

		        }
		       //����ȡ��������ƶ�������ͼ��������ӵ����Ͽ��
				line.add(new Zuobiao(x1, y1, x2, y2,style));
//				��ӡ������ƶ�ǰ����������Ӧ��ͼ������
				System.out.println(line.get(line.size()-1).getStyle()+","+line.get(line.size()-1).getX1()+","+line.get(line.size()-1).getY1()+","+line.get(line.size()-1).getX2()+","+line.get(line.size()-1).getY2());
			}
		});

		}
				
	//����Ĺ��췽��
	public chuangti() {
	   
	    this.setLayout(null); //����齨����
	    //����ͼ��ѡ��ť
	    JButton a=new JButton("ֱ��");
	    JButton b=new JButton("����");
	    JButton c=new JButton("Բ");
	    //���ð�ťλ�ô�С
	    a.setBounds(10, 10, 70, 50);
	    b.setBounds(100, 10, 70, 50);
	    c.setBounds(190, 10, 70, 50);
	    //���������ʶ���������ѡ������ͼ�εİ�ť������ֵ����style 
        a.addMouseListener(new MouseAdapter() {
	    	
       public void mousePressed(MouseEvent e) {
		style=1;
	    	}
		});			
	    b.addMouseListener(new MouseAdapter() {
	    	
	    	public void mousePressed(MouseEvent e) {
	    		style=2;
	    		
	    	}
		});
	    c.addMouseListener(new MouseAdapter() {
	    	
	    	public void mousePressed(MouseEvent e) {
	    		style=3;
	    	}
		});
	    
	    
	    this.jianting();		//��������Ӽ���
	    //����ť��ӵ�����
	    this.add(a);			
	    this.add(b);		
	    this.add(c);
	    
		this.setSize(1500, 1000);  //���ô����С
		this.setTitle("��ͼ");		//���ô�������
		this.setLocationRelativeTo(null);		//���ô���Ĭ����Ļ����
		this.setVisible(true);					//����ɼ�
		//��رճ����˳�jvm
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);          
            }
         });
	}
	
	

}



