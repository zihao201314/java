package day2018_12_18;

/**  
* �ļ���: Try.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��20�� ����3:30:44 
*/
public class Try {

	public static void main(String[] args) {
		Try a=new Try();
			System.out.println(a.zxc("12","0"));
			
	}
	
	public int zxc(String a,String b) {
		int A;
		int B;
		int C=0;
		
		try {
		A=Integer.parseInt(a);
		B=Integer.parseInt(b);
		C=A/B;
		
		} catch (NumberFormatException e) {
	System.out.println("�޷������ַ���");
		}catch (Exception e) {
			System.out.println("00000000");
		}finally {
	System.out.println("ִ�����");
		}
		return C;
	}
}
