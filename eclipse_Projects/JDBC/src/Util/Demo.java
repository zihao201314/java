package Util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

/**  
* �ļ���: Demo.java 
* ���ߣ���� 
* ʱ�䣺 2019��5��7�� ����10:45:14 
*/
public class Demo {
    public static void main(String[] args) throws Exception {
		String sql="INSERT INTO Users VALUES ('Gates')";
		Connection con=Jdbc.getCon();
	    int a=con.createStatement().executeUpdate(sql);
		System.out.println(a);
	}
}
