package d2;

/**  
* �ļ���: demo2.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��2�� ����6:43:42 
*/
public class demo2 {
public static void main(String[] args) {
	System.out.println(demo2.aaa(7));
}

public static int aaa(int a) {
	if(a==0) {
		return 0;
	}else if(a==1) {
		return 1;
	}else {
		return aaa(a-1)+aaa(a-2);
	}
}
}
