package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**  
* 文件名: Jdbc.java 
* 作者：梓灏 
* 时间： 2019年5月7日 下午10:19:06 
*/
public class Jdbc {
 
	private static String Url="jdbc:mysql://localhost:3306/study?serverTimezone=UTC&useUnicode = true&characterEncoding = utf-8&useSSL = false";
    private static String UserName="root";
    private static String PassWord="root";
    private static String jdbcName="com.mysql.cj.jdbc.Driver";
    
    
    public static Connection getCon() {
    	Connection Con = null;
    	try {
			Class.forName(jdbcName);
			System.out.println("数据库驱动加载成功");
			try{
	    		Con=DriverManager.getConnection(Url, UserName, PassWord);
	    		System.out.println("数据库连接成功");
			} catch (SQLException e) {
				
				System.out.println("数据库连接失败");
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println("数据库驱动加载失败");
		}  
    	
		return Con;
    	
    }
    public static void main(String[] args) {
		System.out.println(Jdbc.getCon());
	}
}
