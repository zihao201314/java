package copy;

import java.io.File;
import java.io.IOException;

public class FileDemo11 {
	public static void main(String args[]) {
		File my = new File("F:\\CQBK\\�ֳ����ÿ�\\09-���������" + File.separator);// ����·��,�������ⲿ����������
		print(my);
	}

	public static void print(File file) {// �ݹ����
		if (file != null) {// �ж϶����Ƿ�Ϊ��
			if (file.isDirectory()) {// �����Ŀ¼
				File f[] = file.listFiles();// �г�ȫ�����ļ�
				if (f != null) {// �жϴ�Ŀ¼�ܷ��г�
					for (int i = 0; i < f.length; i++) {
						print(f[i]);// ��Ϊ����·���п�����Ŀ¼�����ԣ������ж�
					}
				}
				CopyFile2.copy(file);
				System.out.println(file);
			} else {
				//System.out.println(file);// ���·��
			}
		}
	}
}