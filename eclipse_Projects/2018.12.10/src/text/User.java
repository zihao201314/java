package text;

/**  
* 文件名: User.java 
* 作者：梓灏 
* 时间： 2018年12月20日 下午6:52:46 
*/
public class User {
	public static String username[]= {"呵呵","狗蛋","王鹏","孙涛"};
	public static void login(String a) throws UserException {
		for(String e:username) {
			if(e.equals(a)) {
				throw new UserException("用户名重复");
			}
		}
		System.out.println("注册成功");
	}
	
}
