package day2018_12_18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
* �ļ���: Data.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��19�� ����8:29:14 
*/
public class Data1 {
public static void main(String[] args) {
//	Date a =new Date();
//    //	Date a =new Date(System.currentTimeMillis()-24*60*60*1000);
//	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS E");
//	System.out.println(sim.format(a));
//	
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
	String a="2018-12-12 12:25:36:025";
	try {
		System.out.println(sim.parse(a));
	} catch (ParseException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
			
}
	
}

