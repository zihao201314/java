package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**  
* �ļ���: Jdbc.java 
* ���ߣ���� 
* ʱ�䣺 2019��5��7�� ����10:19:06 
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
			System.out.println("���ݿ��������سɹ�");
			try{
	    		Con=DriverManager.getConnection(Url, UserName, PassWord);
	    		System.out.println("���ݿ����ӳɹ�");
			} catch (SQLException e) {
				
				System.out.println("���ݿ�����ʧ��");
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println("���ݿ���������ʧ��");
		}  
    	
		return Con;
    	
    }
    public static void main(String[] args) {
		System.out.println(Jdbc.getCon());
	}
}
