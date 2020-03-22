package text;

/**  
* 文件名: New.java 
* 作者：梓灏 
* 时间： 2018年12月20日 下午7:09:30 
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