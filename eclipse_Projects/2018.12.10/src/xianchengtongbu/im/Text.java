package xianchengtongbu.im;

/**  
* �ļ���: Text.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��24�� ����7:14:31 
*/
public class Text {
public static void main(String[] args) {
//	 Thread a=new Thread(new shoupiao());
//	 a.start();
	
	shoupiao a=new shoupiao();
	new Thread(a,"aaaa").start();
	new Thread(a,"bbbb").start();
	new Thread(a,"cccc").start();
	
}
}
