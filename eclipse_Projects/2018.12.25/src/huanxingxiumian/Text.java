package huanxingxiumian;

/**  
* �ļ���: Text.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����11:28:08 
*/
public class Text {
 public static void main(String[] args) {
	Money a=new Money(0.0);
	Set b=new Set(a);
	Get c=new Get(a);
	
	new Thread(b).start();
	new Thread(c).start();
	
}
}
