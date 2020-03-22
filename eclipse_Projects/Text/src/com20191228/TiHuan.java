package com20191228;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * �ļ���: TiHuan.java ���ߣ���� ʱ�䣺 2019��12��28�� ����3:25:03
 */
public class TiHuan {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\16685\\Desktop\\�½��ļ���"; // Ҫ��ȡ���ļ���·��
		File outPath = new File("C:\\Users\\16685\\Desktop\\��1���ļ���"); // ����һ������ļ��е�·��(������Ҳ����)
		readFolder(filePath, outPath);
	}

	/**
	 * ��ȡ�ļ���
	 * 
	 * @return
	 */
	public static void readFolder(String filePath, File outPath) {
		try {
			// ��ȡָ���ļ����µ������ļ�
			File file = new File(filePath);
			if (!file.isDirectory()) {
				System.out.println("---------- ���ļ�����һ��Ŀ¼�ļ� ----------");
			} else if (file.isDirectory()) {
				System.out.println("---------- ����һ��Ŀ¼�ļ��� ----------");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filePath + "\\" + filelist[i]);
					// String path = readfile.getPath();//�ļ�·��
					String absolutepath = readfile.getAbsolutePath();// �ļ��ľ���·��
					String filename = readfile.getName();// �������ļ���
					readFile(absolutepath, filename, i, outPath);// ���� readFile ������ȡ�ļ����������ļ�
				}
				System.out.println("---------- �����ļ�������� ----------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ�ļ����µ��ļ�
	 * 
	 * @return
	 */
	public static void readFile(String absolutepath, String filename, int index, File outPath) {
		try {
			BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(absolutepath)));// ��������ȡ�ļ�
			StringBuffer strBuffer = new StringBuffer();
			String old="����ҵ����";
			String empty = "";
			String tihuan = "";
			for (String temp = null; (temp = bufReader.readLine()) != null; temp = null) {
				if (temp.indexOf(old) != -1) { // �жϵ�ǰ���Ƿ������Ҫ�滻�����ַ� -1��ʾ����
					tihuan = temp.substring(0, 9);// �����ȡ�೤�Լ���
					temp = temp.replace(tihuan, empty);// �滻Ϊ����Ҫ�Ķ���
				}
				strBuffer.append(temp);
				strBuffer.append(System.getProperty("line.separator"));// ������֮��ķָ�
			}
			bufReader.close();
			if (outPath.exists() == false) { // �������ļ����Ƿ���ڣ����������ȴ���
				outPath.mkdirs();
				System.out.println("�ѳɹ���������ļ��У�" + outPath);
			}
			PrintWriter printWriter = new PrintWriter(outPath + "\\" + filename);// �滻��������ļ�λ�ã��м������E:/ttt
																					// ����ı��ر���������ļ��У�
			printWriter.write(strBuffer.toString().toCharArray());
			printWriter.flush();
			printWriter.close();
			System.out.println(
					"�� " + (index + 1) + " ���ļ�   " + absolutepath + "  �ѳɹ������    " + outPath + "\\" + filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}