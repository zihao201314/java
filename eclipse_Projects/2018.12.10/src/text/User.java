package text;

/**  
* �ļ���: User.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��20�� ����6:52:46 
*/
public class User {
	public static String username[]= {"�Ǻ�","����","����","����"};
	public static void login(String a) throws UserException {
		for(String e:username) {
			if(e.equals(a)) {
				throw new UserException("�û����ظ�");
			}
		}
		System.out.println("ע��ɹ�");
	}
	
}
