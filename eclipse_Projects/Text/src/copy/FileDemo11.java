package copy;

import java.io.File;
import java.io.IOException;

public class FileDemo11 {
	public static void main(String args[]) {
		File my = new File("F:\\CQBK\\现场配置库\\09-柜面改造组" + File.separator);// 操作路径,可以有外部参数决定的
		print(my);
	}

	public static void print(File file) {// 递归调用
		if (file != null) {// 判断对象是否为空
			if (file.isDirectory()) {// 如果是目录
				File f[] = file.listFiles();// 列出全部的文件
				if (f != null) {// 判断此目录能否列出
					for (int i = 0; i < f.length; i++) {
						print(f[i]);// 因为给的路径有可能是目录，所以，继续判断
					}
				}
				CopyFile2.copy(file);
				System.out.println(file);
			} else {
				//System.out.println(file);// 输出路径
			}
		}
	}
}