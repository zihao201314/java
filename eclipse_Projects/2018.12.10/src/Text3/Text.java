package Text3;

/**  
* �ļ���: Text.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����1:59:05 
*/
public class Text {
 public static void main(String[] args) {
	 new Thread(new Music()).start();
	 new Thread(new Play()).start();
}
}
