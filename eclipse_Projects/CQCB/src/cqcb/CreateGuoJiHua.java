package cqcb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * �ļ���: CreateGuoJiHua.java ���ߣ���� ʱ�䣺 2019��11��14�� ����3:25:04
 */
public class CreateGuoJiHua {
	/**
	 * 
	 * 
	 * @param map
	 * @param path
	 * @param fileName
	 */
	public static void createGuoJiHuaZh(Map map, String path, String fileName) {

		String file = path + "\\" + fileName + "_zh.lgdict";
		try {
			File file1 = new File(file);
			if (file1.exists()) {
				System.out.println("���ʻ��ļ�zh���ڣ�\n\n");
				if (file1.isFile()) {

					file1.delete();
				}
				System.out.println("ԭ�й��ʻ��ļ�zh��ɾ����\n\n");
			}
			String line = System.getProperty("line.separator");
			StringBuffer str = new StringBuffer();
			OutputStream out = new FileOutputStream(file);
			// FileWriter fw = new FileWriter(file);
			Set set = map.entrySet();
			int size = set.size();
			int i = 0;
			Iterator iter = set.iterator();
			str.append("{").append(line);
			while (iter.hasNext()) {
				i++;
				Map.Entry entry = (Map.Entry) iter.next();
				if (size == i) {
					str.append("	" + "\"" + entry.getKey() + "\"" + " : " + "\"" + entry.getValue() + "\"")
							.append(line);

				} else {
					str.append("	" + "\"" + entry.getKey() + "\"" + " : " + "\"" + entry.getValue() + "\",")
							.append(line);
				}
			}
			str.append("}");

			out.write(str.toString().getBytes("UTF-8"));
			// fw.write(str.toString());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param map
	 * @param path
	 * @param fileName
	 */
	public static void createGuoJiHuaEn(Map map, String path, String fileName) {
		String file = path + "\\" + fileName + "_en.lgdict";
		try {
			File file1 = new File(file);
			if (file1.exists()) {
				System.out.println("���ʻ��ļ�en���ڣ�\n\n");
				if (file1.isFile()) {
					file1.delete();
				}
				System.out.println("ԭ�й��ʻ��ļ�en��ɾ����\n\n");
			}
			String line = System.getProperty("line.separator");
			StringBuffer str = new StringBuffer();

			OutputStream out = new FileOutputStream(file);

			// FileWriter fw = new FileWriter(file);
			Set set = map.entrySet();
			int size = set.size();
			Iterator iter = set.iterator();
			str.append("{").append(line);
			int i = 0;
			while (iter.hasNext()) {
				i++;
				Map.Entry entry = (Map.Entry) iter.next();
				if (size == i) {
					str.append("	" + "\"" + entry.getKey() + "\"" + " : " + "\"" + "\"").append(line);
				} else {
					str.append("	" + "\"" + entry.getKey() + "\"" + " : " + "\"" + "\",").append(line);
				}
			}
			str.append("}");

			out.write(str.toString().getBytes("UTF-8"));
			// fw.write(str.toString());
			out.close();
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
