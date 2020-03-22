package cqcb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**  
* �ļ���: GetTable.java 
* ���ߣ���� 
* ʱ�䣺 2019��11��14�� ����6:39:03 
*/
public class GetTable {

	public static Map getTable() {
			
		Map Id_Text = new HashMap();
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File("table.txt")), "GB2312"));

			String lineTxt = null;
			while ((lineTxt = br.readLine()) != null) {
				String[] newLine = br.readLine().split("\\s+");
				String key = newLine[1];
				String value = newLine[0];
				Id_Text.put(key, value);
			}
			System.out.println(Id_Text);
			
		} catch (Exception e) {
			System.out.println("��ȡtable�ļ�ʧ��");
		}
		return Id_Text;
	}
}
