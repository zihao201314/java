package Util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

/**  
* 文件名: Demo.java 
* 作者：梓灏 
* 时间： 2019年5月7日 下午10:45:14 
*/
public class Demo {
    public static void main(String[] args) throws Exception {
		String sql="INSERT INTO Users VALUES ('Gates')";
		Connection con=Jdbc.getCon();
	    int a=con.createStatement().executeUpdate(sql);
		System.out.println(a);
	}
}
