package day2018_12_18;

/**  
* �ļ���: Intinger.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��19�� ����3:26:22 
*/
public class Intinger {
 public static void main(String[] args) {
	 long a=System.currentTimeMillis();
	 String c="";
	for (int i = 1; i < 100000; i++) {
		c += i;	
		c+="+";
  
}
	   long b=System.currentTimeMillis();   
	     System.out.println(b-a);
 }
 }
