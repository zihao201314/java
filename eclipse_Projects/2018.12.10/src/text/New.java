package text;

/**  
* �ļ���: New.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��20�� ����7:09:30 
*/
public class New {
public static void main(String[] args) {
	try {
		User.login("666");
	} catch (UserException e) {

		System.out.println(e.toString());
	}

}


}