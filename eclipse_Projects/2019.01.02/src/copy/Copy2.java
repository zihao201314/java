package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**  
* 文件名: Copy.java 
* 作者：梓灏 
* 时间： 2019年1月5日 下午6:27:51 
*/
public class Copy2 {
public static void main(String[] args) throws Exception {
	work1("E:\\WallPaper\\134925.jpg","C:\\Users\\16685\\Desktop\\1.jpg");
	//work2("F:\\java基础班视频\\（7天）第五次\\13天的\\10.txt","C:\\Users\\16685\\Desktop\\1.txt");
	
}

//所有文件类型的拷贝
private static void work1(String copyof, String copyto) {
	
	try(InputStream in = new FileInputStream(copyof);
			OutputStream out = new FileOutputStream(copyto);){
		byte[] b=new byte[1024];
		int len;
		while ((len=in.read(b))!=-1) {
			out.write(b, 0, len);
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}