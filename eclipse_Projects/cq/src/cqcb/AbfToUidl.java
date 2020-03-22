package cqcb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
* 文件名: AbfToUidl.java 
* 作者：梓灏 
* 时间： 2019年11月14日 下午5:01:01
 */

public class AbfToUidl{

	public static String abfpathAndName = null;
	public static String path = null;
	public static String ID = null;
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File("Read.txt")), "GB2312"));
			abfpathAndName = br.readLine().split("\"")[1];
			path = br.readLine().split("\"")[1];
			ID = br.readLine().split("\"")[1];
			br.close();
			
		} catch (Exception e) {
		}
	
		PrintStream out;

		try {
			out = System.out;
			out = new PrintStream("log.txt");
			System.setOut(out);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
		
		
		
		String uidl=path+"\\"+ID+".uidl";
		
		Map Id_Text = GetTable.getTable();
		
		Map xml = GetXml.getXml(abfpathAndName);

		ArrayList xmlAndGuoJiHua = (ArrayList) CreateXml.createDocument(xml, ID, Id_Text);

		HashMap GuoJiHua = (HashMap) xmlAndGuoJiHua.get(0);
		org.dom4j.Document document = (org.dom4j.Document) xmlAndGuoJiHua.get(1);
		System.out.println("\n\n-----------uidl文件开始输出！------\n\n");

		CreateXml.writeXml(uidl, document);
		System.out.println("\n\n-----------uidl输出完毕！------\n\n");
		CreateGuoJiHua.createGuoJiHuaZh(GuoJiHua,path,ID);
		CreateGuoJiHua.createGuoJiHuaEn(GuoJiHua,path,ID);
		
		System.out.println("转换成功！！！");


	}

}