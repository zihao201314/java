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
* 文件名: chuangti.java 
* 作者：梓灏 
* 时间： 2018年12月26日 下午5:08:53 
*/
public class chuangti extends JFrame{
	
	private ArrayList<Zuobiao> line =new ArrayList<Zuobiao>();	//创建一个可以存放 鼠标移动坐标和类型 的集合框架
	private int style;   // 判断是哪种图形 1代表直线，2代表矩形，3代表椭圆
	int x1;             //四个int变量鼠标的定位
	int y1;          
	int x2;
	int y2;
	    //绘制窗体，每次打开（显示）都会重新绘制，所以下面的for是对之前绘制的图形的自动重新绘制
		public void paint(Graphics g) {
		super.paint(g);
		for (Zuobiao e : line) {
			
			// 判断是哪种图形 1代表直线，2代表矩形，3代表椭圆
			if(e.getStyle()==1) {
			g.drawLine(e.getX1(), e.getY1(), e.getX2(), e.getY2());
			// 判断是哪种图形 1代表直线，2代表矩形，3代表椭圆
		}else if(e.getStyle()==2) {
			// 判断向哪个方向拖动，相应的确定从哪里开始画
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
			// 判断是哪种图形 1代表直线，2代表矩形，3代表椭圆
		else {
			// 判断向哪个方向拖动，相应的确定从哪里开始画
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
		//窗体的鼠标监听
	private void jianting() {
		
		
		this.addMouseListener(new MouseAdapter() {
			
			//按下
			public void mousePressed(MouseEvent e) {	
				
				x1=e.getX();
				y1=e.getY();
			}
			//释放
			public void mouseReleased(MouseEvent e) {
				
				x2=e.getX();
				y2=e.getY();
			
		        /**
                                                  * 判断是哪种图形
                             * 1代表直线，2代表矩形，3代表椭圆
                */
				if(style==1) {
		        	chuangti.this.getGraphics().drawLine(x1, y1, x2, y2);
		        }
				
		        /**
		         	* 判断是哪种图形
		         		* 1代表直线，2代表矩形，3代表椭圆
                */
				
				else if(style==2) {
		        	/**
		        	 * 判断向哪个方向拖动，相应的确定从哪里开始画
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
		                         * 判断是哪种图形
		                         * 1代表直线，2代表矩形，3代表椭圆
		         */
		        else if(style==3){
		        	/**
		        	 * 判断向哪个方向拖动，相应的确定从哪里开始画
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
		       //将获取到的鼠标移动监听和图像类型添加到集合框架
				line.add(new Zuobiao(x1, y1, x2, y2,style));
//				打印出鼠标移动前后的坐标和相应的图像类型
				System.out.println(line.get(line.size()-1).getStyle()+","+line.get(line.size()-1).getX1()+","+line.get(line.size()-1).getY1()+","+line.get(line.size()-1).getX2()+","+line.get(line.size()-1).getY2());
			}
		});

		}
				
	//窗体的构造方法
	public chuangti() {
	   
	    this.setLayout(null); //清空组建布局
	    //创建图形选择按钮
	    JButton a=new JButton("直线");
	    JButton b=new JButton("矩形");
	    JButton c=new JButton("圆");
	    //设置按钮位置大小
	    a.setBounds(10, 10, 70, 50);
	    b.setBounds(100, 10, 70, 50);
	    c.setBounds(190, 10, 70, 50);
	    //添加鼠标监听识别鼠标点击了选择哪种图形的按钮，并将值赋给style 
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
	    
	    
	    this.jianting();		//给窗体添加监听
	    //将按钮添加到窗体
	    this.add(a);			
	    this.add(b);		
	    this.add(c);
	    
		this.setSize(1500, 1000);  //设置窗体大小
		this.setTitle("画图");		//设置窗体名称
		this.setLocationRelativeTo(null);		//设置窗体默认屏幕居中
		this.setVisible(true);					//窗体可见
		//点关闭彻底退出jvm
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);          
            }
         });
	}
	
	

}



