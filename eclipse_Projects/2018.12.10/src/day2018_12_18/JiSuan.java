package day2018_12_18;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class JiSuan extends JFrame{
	JPanel panel;
	JTextField text;
	JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;	//0~9�ĸ����֣���д�����飩
	JButton bot,add,sub,mul,div,equ;	//�Ӽ��˳��Լ�С�����������
	public JiSuan(){
		this.setBounds(300, 200, 400, 300);	//�����С
		this.setTitle("������");	//��������
		this.setLayout(new BorderLayout());	//���ü��������Ĳ��ַ�ʽ
		
		text = new JTextField(15);		//��������
		
		//�½����ְ�ť
		jb0 = new JButton("0");
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		jb7 = new JButton("7");
		jb8 = new JButton("8");
		jb9 = new JButton("9");
		
		//�½����Ű�ť
		bot = new JButton(".");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		equ = new JButton("=");
		
		//�½����������ּ����������������
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));	//�������Ĳ��ַ�ʽ
		
		//������ť���������壨panel����
		//��һ��
		panel.add(jb7);
		panel.add(jb8);
		panel.add(jb9);
		panel.add(div);
		//�ڶ���
		panel.add(jb4);
		panel.add(jb5);
		panel.add(jb6);
		panel.add(mul);
		//������
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(sub);
		//������
		panel.add(bot);
		panel.add(jb0);
		panel.add(equ);
		panel.add(add);
		
		
		this.add(text,BorderLayout.NORTH);
		this.add(panel);
		
		MyEvent();	//�¼�����
		
		this.setVisible(true);	//���ô�����ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���ô���ɹر�
	}
	
	public void MyEvent(){
		/*���������ݷ�װ��Text������
		 * jb0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				text.setText("0");
				String str = jb0.getText();
				System.out.println(str);
			}
			
		});*/
		//Ϊ����ť����¼�����
		Text(jb0);
		Text(jb1);
		Text(jb2);
		Text(jb3);
		Text(jb4);
		Text(jb5);
		Text(jb6);
		Text(jb7);
		Text(jb8);
		Text(jb9);
		Text(bot);
		Text(add);
		Text(sub);
		Text(mul);
		Text(div);
		
		//��=����ť���¼�����
		equ.addActionListener(new ActionListener(){
 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				text.setText(text.getText()+equ.getText());
				
				if(text.getText().contains("+")){//���ӷ�����
//					String[] str1 = text.getText().split("+");		//�������
					StringTokenizer st1 = new StringTokenizer(text.getText(),"+");
//					System.out.println("str1======"+st1.nextToken());
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
//						System.out.println("str2======"+st2.nextToken());
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1+d2));
				}else if(text.getText().contains("-")){//����������
					StringTokenizer st1 = new StringTokenizer(text.getText(),"-");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1-d2));
				}else if(text.getText().contains("*")){//���˷�����
					StringTokenizer st1 = new StringTokenizer(text.getText(),"*");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1*d2));
				}else if(text.getText().contains("/")){//����������
					StringTokenizer st1 = new StringTokenizer(text.getText(),"/");
					double d1,d2 = 0;
					d1 = Double.parseDouble(st1.nextToken());
					while(st1.hasMoreTokens()){
						StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
						d2 = Double.parseDouble(st2.nextToken());
					}
					
					text.setText(text.getText()+" "+(d1/d2));	//���������ŵ�text����
				}
			}
			
		});
	}
	
	//����ť���¼�������
	public void Text(JButton button){
		button.addActionListener(new ActionListener(){
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				text.setText("0");
				String str = button.getText();
//				System.out.println(str);
				text.setText(text.getText()+str);
			}
			
		});
//		return button.getText();
	}
	
	//������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JiSuan();
	}
 
}
