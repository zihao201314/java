package d2;

/**  
* �ļ���: demo3.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:47:59 
* �ݹ���׳�
*/
public class demo3 {
public static void main(String[] args) {
	System.out.println(demo3.n(15));
}
	public static int n(int a) {
		if(a==0) {
			return 0;
		}if (a==1) {
			return 1;
		} else {
       return a*(n(a-1));
		}
}
}